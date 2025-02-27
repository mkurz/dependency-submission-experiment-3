ThisBuild / scalaVersion     := "2.13.16"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val sub1 = (project in file("subproject1"))
  .settings(
    libraryDependencies += "commons-io" % "commons-io" % "2.11.0", // has vulnerabilities
  )

lazy val sub2 = (project in file("subproject2"))
  .settings(
    libraryDependencies += "org.eclipse.jetty" % "jetty-http" % "12.0.11", // has vulnerabilities
  )

lazy val root = (project in file("."))
  .settings(
    name := "Dependency Submission Experiment",
    libraryDependencies += "io.netty" % "netty-handler" % "4.1.115.Final", // has vulnerabilities
  ).aggregate(sub1, sub2)

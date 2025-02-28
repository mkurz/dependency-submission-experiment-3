ThisBuild / scalaVersion     := "2.13.16"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val sub1 = (project in file("subproject1"))
  .settings(
  )

lazy val sub2 = (project in file("subproject2"))
  .settings(
  )

lazy val root = (project in file("."))
  .settings(
    name := "Dependency Submission Experiment",
  ).aggregate(sub1, sub2)

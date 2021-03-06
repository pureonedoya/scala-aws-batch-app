import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "latest"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "sample",
    libraryDependencies ++= akkaDependencies,
    mainClass in (Compile, run) := Some("example.Bootstrap"),
  )
  .settings(ECR.containerSettings: _*)
  .enablePlugins(JavaAppPackaging)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
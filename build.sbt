lazy val commonSetting = Seq(
  organization := "com.example",
  version := "1.0",
  scalaVersion := "2.12.0"
)

val baseDependencies = Seq(
  "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"
)

lazy val root = (project in file("."))
  .settings(commonSetting: _*)
  .settings(
    name := "workshop",
    libraryDependencies ++= baseDependencies
  )
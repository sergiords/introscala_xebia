name := "scala-hands-on"

organization := "fr.xebia.xke"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test",
  "org.spire-math" %% "cats" % "0.3.0"
)

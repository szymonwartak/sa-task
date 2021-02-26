

scalaVersion := "2.13.3"

name := "superawesome"
organization := "org.szymon"
version := "1.0"

resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"

libraryDependencies ++= List(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test

)


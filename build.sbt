inThisBuild(List(
  organization := "ch.timo-schmid",
  homepage := Some(url("https://github.com/timo-schmid/slf4s")),
  licenses := List("MIT" -> url("https://github.com/timo-schmid/slf4s/blob/master/LICENSE")),
  developers := List(
    Developer(
      "timo-schmid",
      "Timo Schmid",
      "timo-schmid@gmail.com",
      url("https://github.com/timo-schmid/slf4s")
    )
  ),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/timo-schmid/slf4s"),
      "scm:git@github.com:timo-schmid/slf4s.git"
    )
  )
))

lazy val slf4s = (project in file(".")).settings(
  name := "slf4s-api",
  scalaVersion := "2.12.1",
  crossScalaVersions := List("2.13.0", "2.12.8", "2.11.12"),
  scalacOptions := Seq("-unchecked", "-deprecation", "-language:experimental.macros"),
  version := "1.7.1",
  libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.slf4j" % "slf4j-api" % version.value,
    "org.scalatest" %% "scalatest" % "3.0.8" % Test,
    "org.mockito" % "mockito-core" % "2.7.22" % Test,
    "ch.qos.logback" % "logback-classic" % "1.2.3" % Test
  )
)


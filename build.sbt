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

lazy val latestSlf4jVersion = "1.7.27"

lazy val slf4s = (project in file(".")).settings(
  name := "slf4s-api",
  scalaVersion := "2.12.10",
  crossScalaVersions := List("2.13.1", "2.12.10", "2.11.12"),
  scalacOptions := Seq("-unchecked", "-deprecation", "-language:experimental.macros"),
  version := {
    if(CiReleasePlugin.travisBranch == "master")
      s"$latestSlf4jVersion-SNAPSHOT"
    else if(CiReleasePlugin.isTravisTag)
      version.value
    else
      s"$latestSlf4jVersion-SNAPSHOT"
  },
  libraryDependencies ++= {
    val slf4jVersion =
      if(CiReleasePlugin.travisBranch == "master")
        latestSlf4jVersion
      else if(CiReleasePlugin.isTravisTag)
        version.value
      else
        latestSlf4jVersion
    Seq(
      "org.scala-lang" % "scala-reflect" % scalaVersion.value,
      "org.slf4j" % "slf4j-api" % slf4jVersion,
      "org.scalatest" %% "scalatest" % "3.0.8" % Test,
      "org.mockito" % "mockito-core" % "2.7.22" % Test,
      "ch.qos.logback" % "logback-classic" % "1.2.3" % Test
    )
  },
  updateOptions := updateOptions.value.withGigahorse(false)
)


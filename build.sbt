lazy val root = project
  .in(file("."))
  .settings(
    organization := "io.github.arthur1",
    organizationName := "arthur1.github.io",
    startYear := Some(2024),
    licenses += License.MIT,
    homepage := Some(url("https://github.com/Arthur1/misezan-scala")),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/Arthur1/misezan-scala"),
        "https://github.com/Arthur1/misezan-scala.git"
      )
    ),
    developers += Developer(
      "Arthur1",
      "ASAKURA Kazuki",
      "32762324+Arthur1@users.noreply.github.com",
      url("https://blog.arthur1.dev/")
    ),
    name := "misezan-scala",
    version := "0.1.0",
    scalaVersion := "3.3.3",
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.18",
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    )
  )

import xerial.sbt.Sonatype.sonatypeCentralHost

ThisBuild / publishTo := sonatypePublishToBundle.value
ThisBuild / sonatypeCredentialHost := sonatypeCentralHost
ThisBuild / versionScheme := Some("semver-spec")

usePgpKeyHex("5206F4243B51D482F9F16C04DD8A2879D75B7142")

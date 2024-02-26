lazy val root = project
  .in(file("."))
  .settings(
    scalaVersion := "3.3.1",
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.18",
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    )
  )

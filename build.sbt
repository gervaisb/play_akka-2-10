ThisBuild / scalaVersion := "2.13.16"

ThisBuild / version := "1.0-SNAPSHOT"

ThisBuild / resolvers += "Akka library repository".at("https://repo.akka.io/maven")

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play_and_akka-2-10""",
    libraryDependencies ++= Seq(
      guice,
      "com.typesafe.akka" %% "akka-actor" % "2.10.0",
      "com.typesafe.akka" %% "akka-actor-typed" % "2.10.0",
      "com.typesafe.akka" %% "akka-protobuf-v3" % "2.10.0",
      "com.typesafe.akka" %% "akka-serialization-jackson" % "2.10.0",
      "com.typesafe.akka" %% "akka-stream" % "2.10.0",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
    )
  )

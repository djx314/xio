import sbt._
import sbt.Keys._

trait Dependencies {

  val zioLoggingVersion = "0.5.3"
  val zio = Seq(
    // "dev.zio" %% "zio-interop-cats"  % "2.1.4.0",
    "dev.zio" %% "zio"               % "1.0.3",
    "dev.zio" %% "zio-logging"       % zioLoggingVersion,
    "dev.zio" %% "zio-logging-slf4j" % zioLoggingVersion
  )

  val circeVersion = "0.14.0-M1"

  val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser" //,
    //"io.circe" %% "circe-optics",
    //"io.circe" %% "circe-generic-extras"
  ).map(_ % circeVersion)

  val j2v8 = "com.eclipsesource.j2v8" % "j2v8" % "6.2.0"

  val sttp = "com.softwaremill.sttp.client" %% "async-http-client-backend-zio" % "2.2.8"

  val AkkaVersion = "2.6.8"
  val akka        = "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion

  val collectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.2.0"

}

object Dependencies extends Dependencies

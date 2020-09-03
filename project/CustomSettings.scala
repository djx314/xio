import sbt._
import sbt.Keys._

trait CustomSettings {

  val scala_213_Version = "2.13.3"
  val scalaSettings = Seq(
    scalacOptions ++= Seq("-feature", "-deprecation"),
    scalaVersion := scala_213_Version,
    crossScalaVersions := List("2.11.12", "2.12.12", scala_213_Version),
  )

  protected val scalaOption1 = scalacOptions ++= {
    if (scalaVersion.value startsWith "2.13") List.empty
    else List("-Ypartial-unification")
  }

  val scaladocSetting = publishArtifact in packageDoc := false

  // addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

  val fmt = org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := true

  val notFmtCompilerSettings = List(scalaOption1, scaladocSetting)
  val compilerSettings       = List(notFmtCompilerSettings, List(fmt)).flatten

}

object CustomSettings extends CustomSettings

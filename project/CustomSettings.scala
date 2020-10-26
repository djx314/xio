import sbt._
import sbt.Keys._

trait CustomSettings {

  val scala_213_Version = "2.13.3"
  val scalaSettings = Seq(
    scalacOptions ++= Seq("-feature", "-deprecation"),
    scalaVersion := scala_213_Version,
    crossScalaVersions := List("2.11.12", "2.12.12", scala_213_Version)
  )

  protected val higherKindsParam = "-language:higherKinds"

  protected val scalaOption1 = scalacOptions ++= {
    if (scalaVersion.value startsWith "2.13") List.empty
    else List("-Ypartial-unification", higherKindsParam)
  }

  // addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

  val scaladocSetting = publishArtifact in packageDoc := false
  val fmt             = org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := true
  val _orgSetting     = organization := "org.scalax.xio"
  val _versionSetting = version := "0.0.1-SNAPSHOT"

  val vSetting               = List(_orgSetting, _versionSetting)
  val notFmtCompilerSettings = List(scalaOption1, scaladocSetting)
  val compilerSettings       = notFmtCompilerSettings ::: List(fmt)

}

object CustomSettings extends CustomSettings

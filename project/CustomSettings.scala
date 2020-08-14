import sbt._
import sbt.Keys._

trait CustomSettings {



  val scalaSettings = Seq(
    //scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import", "-language:existentials")
    scalacOptions ++= Seq("-feature", "-deprecation" /*, "-Ypartial-unification"*/ ),
    scalaVersion := "2.13.3"
  )







  val compilerSettings = Seq(
    // scalacOptions += "-Ypartial-unification",
    org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := true
    // addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
  )

}

object CustomSettings extends CustomSettings

package buildo

import sbt._
import Keys._
import sbtassembly.AssemblyPlugin
import sbtassembly.AssemblyPlugin.autoImport._

object AssemblySettingPlugin extends AutoPlugin {
  override def requires = AssemblyPlugin
  override def trigger = allRequirements

  override def projectSettings: Seq[Def.Setting[_]] = baseSettings

  lazy val baseSettings: Seq[Setting[_]] = Seq(
    test in assembly := {},
    assemblyJarName in assembly:= s"${(name in ThisBuild).value}.jar"
  )
}

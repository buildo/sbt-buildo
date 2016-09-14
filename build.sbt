lazy val commonSettings = Seq(
  organization := "io.buildo",
  version := "0.1.0"
)

lazy val root = (project in file(".")).
  settings(
    commonSettings,
    sbtPlugin := true,
    name := "sbt-buildo",
    description := "sbt plugin for sharing configuration across projects at buildo",
    addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0"),
    licenses := Seq("MIT" -> url("https://github.com/buildo/sbt-buildo/blob/master/LICENSE")),
    scmInfo := Some(ScmInfo(url("https://github.com/buildo/sbt-buildo"), "git@github.com:buildo/sbt-buildo.git")),
    bintrayOrganization := Some("buildo"),
    bintrayRepository := "sbt-buildo"
  )
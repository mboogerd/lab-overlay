name := "overlay"

version := "1.0"

scalaVersion := "2.12.0"

organization := "com.github.mboogerd"

lazy val root = project.in(file("."))
  .settings(ReleaseConf.publishSettings)
  .aggregate(plumtree, scuttlebutt, gossipKit)
  .dependsOn(plumtree, scuttlebutt, gossipKit)

lazy val plumtree = project.in(file("plumtree"))
  .settings(GenericConf.settings())
  .settings(DependenciesConf.settings)
  .settings(LicenseConf.settings)
  .enablePlugins(AutomateHeaderPlugin)

lazy val scuttlebutt = project.in(file("scuttlebutt"))
  .settings(GenericConf.settings())
  .settings(DependenciesConf.settings)
  .settings(LicenseConf.settings)
  .enablePlugins(AutomateHeaderPlugin)

lazy val gossipKit = project.in(file("gossipKit"))
  .settings(GenericConf.settings())
  .settings(DependenciesConf.settings)
  .settings(LicenseConf.settings)
  .enablePlugins(AutomateHeaderPlugin)

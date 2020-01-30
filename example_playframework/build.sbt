name := """example_playframework"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
    guice,
    javaJdbc,
    evolutions,
    "mysql" % "mysql-connector-java" % "5.1.36"
)

libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.4"

lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)
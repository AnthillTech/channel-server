name := """mewa"""

version := "0.14"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers += "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"


libraryDependencies ++= Seq(
  cache,
  ws,
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.1",
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.3" % "test", 
  "org.scalacheck" %% "scalacheck" % "1.11.4" % "test",
  "cc.mewa" %% "mewa-api" % "0.4"
)

scalacOptions ++= Seq("-feature")

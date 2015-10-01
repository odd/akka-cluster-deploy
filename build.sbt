name := "Akka cluster deployment example"

scalaVersion := "2.11.7"

version := "0.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.0",
  "com.typesafe.akka" %% "akka-cluster" % "2.4.0",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.0",
  "ch.qos.logback" % "logback-classic" % "1.1.2"
)

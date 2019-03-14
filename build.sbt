name := "spark-tnse"
scalaVersion := "2.11.12"
version := "1.0"
organization := "com.github.saurfang"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
scalacOptions ++= Seq("-target:jvm-1.8", "-deprecation", "-feature")

parallelExecution in test := false
updateOptions := updateOptions.value.withCachedResolution(true)

logLevel := Level.Debug

libraryDependencies := Seq(
    "org.apache.spark" %% "spark-mllib" % "2.2.0" % "provided",
    "org.scalanlp" %% "breeze-natives" % "0.13.2",
    "org.slf4j" % "slf4j-api" % "1.7.26",
    "org.slf4j" % "slf4j-log4j12" % "1.7.26",
    "org.scalatest" %% "scalatest" % "3.0.6" % "test"
)

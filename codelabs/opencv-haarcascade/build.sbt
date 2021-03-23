lazy val root = (project in file(".")).
  settings(
    name := "feature_detector",
    version := "1.0",
    scalaVersion := "2.12.10"
  )

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.1" % "provided"

libraryDependencies += "org.bytedeco" % "javacv" % "1.2"

libraryDependencies += "org.bytedeco.javacpp-presets" % "opencv" % "3.1.0-1.2" classifier "linux-x86_64"

libraryDependencies += "org.bytedeco.javacpp-presets" % "opencv" % "3.1.0-1.2"

classpathTypes += "maven-plugin"

// EclipseKeys.withSource := true

// EclipseKeys.withJavadoc := true

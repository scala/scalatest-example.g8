lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$package$",
      scalaVersion := "$scala-version$"
    )),
    name := "$name;format="norm"$"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "$scalatest-version$" % Test

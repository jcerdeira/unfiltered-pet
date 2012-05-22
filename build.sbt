organization := "com.example"

name := "unfiltered-netty-pet"

version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-netty-server" % "0.6.2",
   "net.databinder" %% "dispatch-nio" % "0.8.5",
   "org.clapper" %% "avsl" % "0.3.6",
   "net.databinder" %% "unfiltered-spec" % "0.6.2" % "test"
)

resolvers ++= Seq(
  "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"
)
# CulinaryCompanionAPI

# Getting Started
Ensure you have Java, Gradle, and some Java IDE installed. 
###### Gradle
https://gradle.org/install/
###### Java
https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html
###### Jetbrains IntelliJ
https://www.jetbrains.com/idea/?fromMenu

Run the command
```
gradlew wrapper --gradle-version=5.6.2 --distribution-type=bin
```
Then 
```
gradlew bootRun
```
Then you should just be able to run the project through whatever IDE you are running :)

If you run into an issue try adding the following line in gradle.properties inside the gradle folder
The C:\\ will be the location of your personal JDK installation.
```
org.gradle.java.home=C:\\Program Files\\Java\\jdk1.8.0_144
```

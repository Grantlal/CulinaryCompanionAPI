# CulinaryCompanionAPI

# Getting Started
Ensure you have Java, Gradle, and some Java IDE installed. I just put intelliJ cause why.  
###### Gradle
https://gradle.org/install/
###### Java
Don't download Java 13. It seems to be incompatible with gradle 5.6
https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html
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

# Potential Problems and Solutions
Assign a new environment variable as Java_Home with a value of your Path

or

If you run into an issue running the gradle build try adding the following line in gradle.properties inside the gradle folder
The C:\\ will be the location of your personal JDK installation.
```
org.gradle.java.home=C:\\Program Files\\Java\\jdk1.8.0_144
```

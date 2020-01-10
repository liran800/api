Author : liran lahav. [ https://www.linkedin.com/in/liran800/ ]

Example project how to use Spring Boot API, with SPRING DATA.
tables are created automatic in the db.
no need to write sql.
simple -> develop faster -> less code



You can ask for free account on the cloud with AWS / AJURE / IBM.  this example is with IBM cloud.

## IBM Cloud starter
IBM Cloud starter for Java - Spring Framework

#API DOC
http://localhost:8080/v2/api-docs
http://localhost:8080/swagger-ui.html

http://localhost:8080/spring-security-rest/api/v2/api-docs


#For running with local db add vm arg : -Dspring.profiles.active=local

[![](https://img.shields.io/badge/IBM%20Cloud-powered-blue.svg)](https://cloud.ibm.com)
[![Platform](https://img.shields.io/badge/platform-java-lightgrey.svg?style=flat)](https://www.ibm.com/developerworks/learn/java/)

### Table of Contents
* [Summary](#summary)
* [Requirements](#requirements)
* [Configuration](#configuration)
* [Project contents](#project-contents)
* [Run](#run)

### Summary

The IBM Cloud starter for Java - Spring Framework provides a starting point for creating applications running on [Spring](https://spring.io/). It contains no default application code.

Once you have created an application it can be deployed to IBM Cloud using a toolchain click the **Create Toolchain** button.
[![Create Toolchain](https://cloud.ibm.com/devops/graphics/create_toolchain_button.png)](https://cloud.ibm.com/devops/setup/deploy/)

### Requirements
* [Maven](https://maven.apache.org/install.html)
* Java 8: Any compliant JVM should work.
  * [Java 8 JDK from Oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
  * [Java 8 JDK from IBM (AIX, Linux, z/OS, IBM i)](http://www.ibm.com/developerworks/java/jdk/),
    or [Download a Liberty server package](https://developer.ibm.com/assets/wasdev/#filter/assetTypeFilters=PRODUCT)
    that contains the IBM JDK (Windows, Linux)

### Project contents
The project already contains IBM Cloud specific files that are used to deploy the application as part of a IBM Cloud DevOps flow. The `.bluemix` directory contains files used to define the IBM Cloud toolchain and pipeline for your application. The `manifest.yml` file specifies the name of your application in IBM Cloud, the timeout value during deployment and which services to bind to.

### Run

To build and run an application:
1. `mvn install`
1. `java -jar ./target/Comfy-1.0-SNAPSHOT.jar`

To run an application in Docker use the Docker file called `Dockerfile`. If you do not want to install Maven locally you can use `Dockerfile-tools` to build a container with Maven installed.

### Notices

This project was generated using:
* generator-ibm-java v5.15.1
* generator-ibm-service-enablement v3.4.9
* generator-ibm-cloud-enablement v1.8.1
* generator-ibm-java-spring v


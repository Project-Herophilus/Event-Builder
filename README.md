# iDaaS EventBuilder
iDaaS Event Builder - Part of iDaaS DREAM brand. Move back out from under iDaaS-DREAM in Feb 2021.

![Maven Build status](https://github.com/RedHat-Healthcare/iDAAS-EventBuilder/workflows/Maven%20Build/badge.svg)

# iDAAS-EventBuilder
iDAAS EventBuilder is designed to help ANY implementation build, parse and/or transform various forms of healthcare
related data.

## Pre-Requisites
iDAAS EventBuilder Pre-Requisites merely focus around JDK, currently version 1.8 is supported; however, it has been compiled with
numerous other JDKs. The current plan is that as the JDKs for technologies used where iDaaS-Event Builder is implemented you can update the JDK  
that it is built against.

## iDAAS-EventBuilder Design Concepts
iDAAS EventBuilder is built on a tiered concept.
<!--<img src="EventBuilder-Visualized.png" height="325" width="800" alt="Event Builder Components">-->
<br/><br/>

# Directory Layout
| Type|Usage/Implementation |
| -------------|----------|
|Pojos|The basis for all activities. It is leveraged for anything that occurs. Pojos are the basis for all activities the platform provides. The intent is that you can leverage pojos for specific or general usage needs, to support this there are several subsdirectories to help for usage.|
|Parsers|Specific parser based activities that the platform provides and can always be extended. To support extensible there is a directory structure provided. As with everything, it can be extended.|
|Events|Events are what the platform provides. Think of events as activities you are trying to provide, Events can be constructed from scratch or from Pojos.|
|Builders| Are specific data structures. They build data through pojos|

# POM File
This project also contains a POM file to pull in needed third party libraries. There are a few third party libraries  
we need and require. In order to leverage iDAAS Event Builder you can either download, build and then add the JAR file  
locally or you can go ahead and include the following in your existing POM.xml file. We in the dependency we reference
version 1.9; however, there are active enhancements and the releases will continue to grow and expand.

# Implementing iDaaS Event Builder

There are several ways to leverage iDaaS Event Builder depending upon the type of solution it is being used with.

1. Include it within other projects POM.xml file
```
   <dependency>
            <groupId>io.connectedhealth-idaas</groupId>
            <artifactId>idaas-eventbuilder</artifactId>
            <version>1.9.0</version>
   </dependency>
```
2. You can clone the repository and locally build the code. This will produce a jar file that can be included into the other project


# Builds/Releases
This section will cover both local and automated builds.

## Local Builds
1. Use common command line mechanisms or through your IDE to build


If you would like to contribute feel free to, contributions are always welcome!!!!

Happy using and coding....

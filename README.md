![Maven Build status](https://github.com/Project-Herophilus/Event-Builder/workflows/Maven%20Build/badge.svg) [![Event Builder Release](https://github.com/Project-Herophilus/Event-Builder/actions/workflows/release.yml/badge.svg)](https://github.com/Project-Herophilus/Event-Builder/actions/workflows/release.yml) 
# iDaaS EventBuilder
iDaaS Event Builder is part of iDaaS DREAM components. However, we decided to move it into its own repository as this project current gets pushed with releases into the maven repository. It is designed to help ANY implementation parse and/or build and/or transform various forms of structures. While most of these structures are healthcare industry standards based there are a growing set of structures/events within Event Builder that are being adopted for usage within implementations.
related data.

## Pre-Requisites
iDAAS EventBuilder Pre-Requisites merely focus around JDK, currently JDK version 11 is the main standard support it to implement it with this community as that's the current JDSK supported by several of the upstream projects we use. However, it has been compiled with numerous other JDKs and has been used independtly of our community specific efforts as well.

## Directory Structure(s)

Within each directory we try and leverage a directory structure to ensure assets are definable to a more specific business area.

| Type|Usage/Implementation |
| -------------|----------|
|Pojos|The basis for all activities. It is leveraged for anything that occurs. Pojos are the basis for all activities the platform provides. The intent is that you can leverage pojos for specific or general usage needs, to support this there are several subsdirectories to help for usage.|
|Parsers|Specific parser based activities that the platform provides and can always be extended. To support extensible there is a directory structure provided. As with everything, it can be extended.|
|Events|Events are what the platform provides. Think of events as activities you are trying to provide, Events can be constructed from scratch or from Pojos.|
|Converters|Supported conversion between different industry standards|
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
            <version>2.1.0</version>
   </dependency>
```
2. You can clone the repository and locally build the code. This will produce a jar file that can be included into the other project

If you would like to contribute feel free to, contributions are always welcome!!!!

Happy using and coding....

[![Java Build on Code Check-In with Maven](https://github.com/Project-Herophilus/Event-Builder/actions/workflows/base-maven-build.yml/badge.svg)](https://github.com/Project-Herophilus/Event-Builder/actions/workflows/base-maven-build.yml) [![Event Builder Release](https://github.com/Project-Herophilus/Event-Builder/actions/workflows/release.yml/badge.svg)](https://github.com/Project-Herophilus/Event-Builder/actions/workflows/release.yml) 

# iDaaS EventBuilder
iDaaS Event Builder while part of iDaaS DREAM components exists in its own upstream code repository. It is designed to help ANY implementation parse and/or build and/or transform various forms of structures. While most of these structures are healthcare industry standards based there are a growing set of structures/events within Event Builder that are being adopted for usage within implementations.
related data.

## Known Issues
We have seen issues with uses running Windows OS machines and cloning or downloading the source code. It appears some of the classes might be reserved words in the Windows OS.

## Pre-Requisites
iDAAS EventBuilder Pre-Requisites merely focus around JDK, currently JDK version 11 is the main standard support it to implement it with this community as that's the current JDSK supported by several of the upstream projects we use. However, it has been compiled with numerous other JDKs and has been used independtly of our community specific efforts as well.

## Directory Structure(s)
Within each directory we try and leverage a directory structure to ensure assets are definable to a more specific business area.

| Type|Usage/Implementation |
| -------------|----------|
|builders| Are intended to be specific code bases that are built to support specific industry and/or data structures being created. They build data through pojos|
|converters|Supported conversion between different industry standards. Sometimes these will involve using Builders but they can also be encapsulated code bases as well.|
|dataobjects|This is a core basis for most activities. It is leveraged for almost anything that occurs. Dataobjects are the building block for all activities the platform provides. The intent is that you can leverage them for specific or general usage needs, to support this there are several sub-directories for specific business usage.|
|datastructures|This is where you can take dataobjects and make them respresent a construct you are working with. To support many business needs there are several sub-directories for specific business usage.|
|events|Events are what the platform provides for resuability. Think of events as activities you are trying to provide, while the code might be seperated and reference dataobjects or datastructures the key here is these events typically leverage a parser to ensure they can do all the detailed data work needed.|
|parsers|Specific parser based activities that the platform provides and can always be extended. To support extensible there is a directory structure provided. As with everything, it can be extended.|

# POM File
This project also contains a POM file to pull in needed third party libraries. There are a few third party libraries  
we need and require. In order to leverage iDAAS Event Builder you can either download, build and then add the JAR file  
locally or you can go ahead and include the following in your existing POM.xml file. There are active enhancements ongoing 
so feel fee to look up iDaaS Event Builder in Maven Repository to make sure you get the latest release.
```
   <dependency>
            <groupId>io.connectedhealth-idaas</groupId>
            <artifactId>idaas-eventbuilder</artifactId>
            <version>2.3.0</version>
   </dependency>
```

# Implementing iDaaS Event Builder

There are several ways to leverage iDaaS Event Builder depending upon the type of solution it is being used with.

1. Leverage it with iDaaS, it is a core capability that is already leveraged within the various specific components of iDaaS based on need, 
2. Leverage iDaaS-EventBuilder within your development work. To do so, just include our POM.xml within other your project(s) as shown above.
3. You can clone the repository and locally build the code. This will produce a jar file that can be included into the other project.

If you would like to contribute feel free to, contributions are always welcome!!!!

Happy using and coding....

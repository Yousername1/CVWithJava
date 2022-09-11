# CVwithJava
This is an overview of the main commands of the OpenCV library for java.

***
***

# OpenCV Library Import

## First Step

Download the OpenCV library from (https://opencv.org/releases/)

You need to unzip the downloaded archive to any convenient place. You should get the opencv folder.

## Second Step

Create new project.
Now we need to import the library from the opencv folder into our project. For this follow some steps:

_This instruction for IntelliJ IDEA_

>File -> Project Structure -> Modules -> Dependencies

> Click on plus and select "JARs and Directories"

> Brouse your opencv folder and open it

> opencv -> build -> java -> opencv-460.jar -> ok

> Right-click on the opencv-460.jar and select edit

> Click on plus

> opencv -> build -> java -> x64 -> opencv_java460.dll

>(_or opencv -> build -> java -> x86 -> opencv_java460.dll if you use 32-bit system_)

> ok -> ok -> apply -> ok

> **Done!**


***
***

# Working With An Image

## First Step

You should to add a working image to the src folder.
To do this, simply drag and drop your image into this folder.

**tip**: rename your working image to "image"

_If your resources folder isn't "src", you should config your pom.xml
(I will describe below how to do this)_

## Overview of basic commands

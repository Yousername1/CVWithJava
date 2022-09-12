# Computer Vision with Java
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

> Browse your opencv folder and open it

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

## Second Step

Now you are ready to work with the image.

Description of the base classes used in the work, you will find in the 
_**Overview of basic classes**_ file.

Direct work with the image takes place in the _**CVWithJava**_ class.
Description of the implemented methods and commands can be found in the
_**Overview of CVWithJava Class methods**_ file.

The _**HelperMethods**_ class implements some helper methods that do not belong to the 
_OpenCV_ library and are not involved in image processing. 
Description of these methods can be found in the 
_**Overview of HelperMethods Class methods**_ file.





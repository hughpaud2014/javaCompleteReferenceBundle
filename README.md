## The Purpose

The purpose of this java project is to demonstrate the Java language. We are using the Oracle: Java The Complete Reference 11th edition by Herbert Schildt (not associated with this project) as a guide for educational purposes. In normal development, Apps/Programs are developed with many files, that in layman's terms, "piggy-back" off each other to form one fully operational application. What is quite often forgotten is that many of the files in those apps/programs are individual apps/programs themselves that perform a task.

For example, I might have an app that will contain a java file that serves as the entry point for the application, such as App.java. Next, I may have a file called person.java, well Person.java will contain all the necessary building blocks that will only deal with the Person class that the App.java file will use. 

If any sample code requires these complex structures, it will be defined in a subfolder located in the src folder.

I hope this project can grow for those from beginners to advanced learners.

- Paul Hughes

## Getting Started
Java Install
Some PCs might have Java already installed.

To check if you have Java installed on a Windows PC, search in the start bar for Java or type the following in Command Prompt (cmd.exe):

C:\Users\Your Name>java -version

If Java is installed, you will see something like this (depending on version):

java version "11.0.1" 2018-10-16 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.1+13-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.1+13-LTS, mixed mode)

If you do not have Java installed on your computer, you can download it for free at oracle.com.

### Setup for Windows
To install Java on Windows:


- Go to "System Properties" (Can be found on Control Panel > System and Security > System > Advanced System Settings)
- Click on the "Environment variables" button under the "Advanced" tab
- Then, select the "Path" variable in System variables and click on the "Edit" button
- Click on the "New" button and add the path where Java is installed, followed by \bin. By default, Java is installed in C:\Program Files\Java\jdk-11.0.1 (If nothing else was specified when you installed it). In that case, You will have to add a new path with: C:\Program Files\Java\jdk-11.0.1\bin
- Then, click "OK", and save the settings
- At last, open Command Prompt (cmd.exe) and type java -version to see if Java is running on your machine




## Be Sure to Bookmark Page
- [Java Complete Reference](https://hughpaud2014.github.io/javaCompleteReferenceBundle/)

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `src/Track1`: the subfolder to maintain learning track 1
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).

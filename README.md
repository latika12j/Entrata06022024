## Entrata06022024
This repository contains Selenium tests to explore and validate the functionality of entrata.com. that demonstrates how to use Selenium with Java Automation Framework.The Project showcases automation script development using Selenium Webdriver.The project makes use of Test-Base-Utility Classes concept.Base class is the main class which takes care of Browser setup, loading configuration file, handling sync issues and many more. With base class you can avoid code duplication and can reuse the code as much you want.With the Utility Class,we have certain commonly used methods like -taking screenshots. The Script will navigate through different pages ,fill a form,assert the title of the web page and take a screenshot.

###Installation and Pre-Requisites
1.JDK 1.8+(Ensure that Java Class Path is properly set)
2.Maven(Ensure that the .m2 class path is properly set)
3.Eclipse IDE
4.Required Eclipse Plugin:
  -Maven
5.Required Maven Dependencies:
  -selenium-java
  -testng
6.Browser Driver(Ensure that you have the appropriate browser driver for your desired browser and that the class path is correctly configured)

##Framework Setup
To set up the framework, you can either fork or clone the repository from here, or download the ZIP file and set it up in your local workspace.

##Getting Started
Copy the repo into your local machine.
Run tests locally:-
Right click the feature file and select "Run" or "Debug" to start the test.

Run tests through the commandline:-
As this project uses Maven, we can invoke the tests using Maven goals.

###Built With
Selenium - Browser automation framework
Maven - Dependency management
TestNG - Testing framework
WebDriverManager - Local driver binary management



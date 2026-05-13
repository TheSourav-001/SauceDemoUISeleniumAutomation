# SauceDemo UI Automation Framework

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=32&pause=1000&color=2196F3&center=true&vCenter=true&width=850&lines=SauceDemo+UI+Automation+Framework;Built+with+Java+%26+Selenium+WebDriver;Page+Object+Model+(POM)+Architecture;TestNG+%26+Extent+Reports+Integration" alt="Typing SVG" />
</h1>

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF7F00?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

</div>

---

# Project Overview

This repository contains a complete enterprise-level UI Automation Framework developed for the SauceDemo web application using Java, Selenium WebDriver, TestNG, and Maven.

The framework follows industry-standard automation architecture and best practices to ensure scalability, reusability, maintainability, and clean execution flow.

The framework validates complete end-to-end user journeys, exception handling scenarios, and glitch-based testing workflows using dynamic web element strategies.

---

# Framework Architecture

## Design Pattern

- Page Object Model (POM)
- Reduces code duplication
- Improves maintainability
- Keeps test cases modular and reusable

## Test Runner

- TestNG based execution
- Configured using `testng.xml`
- Supports grouped and sequential execution

## Configuration Management

- Centralized configuration handling
- Base URL managed through `config.properties`

## Reporting Engine

- Integrated ExtentReports
- Generates detailed HTML reports
- Includes:
    - Step logs
    - Execution status
    - Failure screenshots
    - Timestamps

## Browser Configuration

Chrome browser configured with:

- Incognito mode
- Disabled password manager popup
- Disabled data breach notifications
- Optimized clean execution session

---

# Prerequisites

Ensure the following tools are installed before execution:

- Java Development Kit (JDK 11 or Higher)
- Apache Maven
- Google Chrome (Latest Version)
- Git
- IntelliJ IDEA (Recommended)

---

# Installation & Setup

## Clone Repository

    git clone https://github.com/TheSourav-001/SauceDemoUISeleniumAutomation.git

## Navigate to Project Directory

    cd SauceDemoUISeleniumAutomation

## Install Dependencies

    mvn clean install -DskipTests

---

# Execution Strategy

The framework supports multiple execution approaches.

## Approach 1: Sequential Execution (Recommended)

Execute all test scenarios sequentially using:

    testng.xml

### Steps

- Locate `testng.xml`
- Right Click
- Select:

  Run 'testng.xml'

---

## Approach 2: Maven Command Line Execution

Ideal for:

- CI/CD pipelines
- Jenkins integration
- Terminal execution

### Command

    mvn clean test

---

## Approach 3: Execute Individual Test Classes

Useful for:

- Debugging
- Isolated testing
- Feature validation

### Navigate To

    src/test/java/tests/

### Example Classes

- `StandardUserJourneyTest.java`
- `LoginErrorTest.java`
- `GlitchUserJourneyTest.java`

Run desired `@Test` methods directly from IDE.

---

# Reporting Mechanism

After execution completes, the framework automatically generates an HTML report.

## Report Location

    target/ExtentReport.html

## Report Features

- Execution timestamps
- Pass/Fail status
- Step-by-step logs
- Assertion details
- Failure screenshots
- Base64 embedded images

---

# Key Features

- Page Object Model Architecture
- Scalable Framework Design
- Dynamic Web Element Handling
- Clean Browser Session Execution
- Exception Handling Validation
- Automated HTML Reporting
- Screenshot Capture on Failure
- Maven Integrated Build System
- TestNG Suite Execution
- CI/CD Friendly Structure

---

# Author

## Sourav Dipto Apu

B.Sc. in Software Engineering.  
Daffodil International University (DIU)

---

# Repository

    https://github.com/TheSourav-001/SauceDemoUISeleniumAutomation

---

# Final Note

This framework is designed following real-world industry automation practices and can be extended easily for enterprise-level web automation projects.
If you found this project useful, consider giving the repository a star on GitHub.
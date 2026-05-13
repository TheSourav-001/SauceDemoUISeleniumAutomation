
# SauceDemo UI Automation Framework

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=700&size=28&pause=1000&color=00D9FF&center=true&vCenter=true&width=700&lines=SauceDemo+UI+Automation+Framework;Java+%7C+Selenium+WebDriver+%7C+TestNG;Enterprise+Grade+Automation+Framework;Fast+%7C+Scalable+%7C+CI%2FCD+Ready" alt="Typing SVG" />
</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white" />
  <img src="https://img.shields.io/badge/TestNG-FF7300?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
  <img src="https://img.shields.io/badge/ExtentReports-6B4FBB?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Chrome-4285F4?style=for-the-badge&logo=googlechrome&logoColor=white" />
</p>

<p align="center">
  <a href="https://github.com/TheSourav-001/SauceDemoUISeleniumAutomation">
    <img src="https://img.shields.io/github/stars/TheSourav-001/SauceDemoUISeleniumAutomation?style=social" />
  </a>
  <img src="https://img.shields.io/badge/license-MIT-blue.svg" />
  <img src="https://img.shields.io/badge/build-passing-brightgreen" />
</p>

---

## Project Overview
 
This repository contains a complete enterprise-level UI Automation Framework developed for the **SauceDemo** web application, built with **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**.
 
The framework is designed following industry-standard automation architecture and best practices to ensure **scalability**, **reusability**, **maintainability**, and a clean execution flow. It validates complete end-to-end user journeys, exception-handling scenarios, and performance-degraded user workflows using dynamic web element interaction strategies.
 
---
 
## Framework Architecture
 
### Design Pattern
 
**Page Object Model (POM)** is implemented as the core architectural pattern across the framework.
 
- Eliminates code duplication by separating page interactions from test logic
- Improves long-term maintainability through modular class design
- Enables reusability of page components across multiple test scenarios
### Test Runner
 
- TestNG-based execution engine
- Suite configured via `testng.xml`
- Supports grouped, sequential, and parallel execution modes
### Configuration Management
 
- Centralized property-based configuration
- Base URL and environment settings managed through `config.properties`
### Reporting Engine
 
ExtentReports is integrated as the primary reporting engine and generates detailed HTML execution reports containing:
 
- Step-level execution logs
- Pass/Fail/Skip status indicators
- Failure screenshots (Base64 embedded)
- Execution timestamps
### Browser Configuration
 
Chrome browser is configured with the following options for a clean and consistent execution environment:
 
- Incognito mode enabled
- Password manager popup disabled
- Data breach notification suppressed
- Optimized session initialization
---
 
## Prerequisites
 
Ensure the following tools are installed before execution:
 
| Requirement | Version |
|---|---|
| Java Development Kit (JDK) | 11 or higher |
| Apache Maven | 3.6+ |
| Google Chrome | Latest stable |
| Git | Any recent version |
| IDE | IntelliJ IDEA (recommended) |
 
---
 
## Installation and Setup
 
### Step 1 — Clone the Repository
 
```bash
git clone https://github.com/TheSourav-001/SauceDemoUISeleniumAutomation.git
```
 
### Step 2 — Navigate to the Project Directory
 
```bash
cd SauceDemoUISeleniumAutomation
```
 
### Step 3 — Install Dependencies
 
```bash
mvn clean install -DskipTests
```
 
---
 
## Execution Strategy
 
The framework supports three execution approaches depending on the use case.
 
---
 
### Approach 1 — Sequential Suite Execution (Recommended)
 
Executes all test scenarios as defined in the TestNG suite file. Best suited for full regression runs.
 
**Steps:**
 
1. Locate `testng.xml` in the project root
2. Right-click the file in the IDE project explorer
3. Select **Run 'testng.xml'**
---
 
### Approach 2 — Maven Command Line Execution
 
Ideal for CI/CD pipeline integration, Jenkins builds, or terminal-based execution.
 
```bash
mvn clean test
```
 
---
 
### Approach 3 — Individual Test Class Execution
 
Useful for debugging, isolated feature validation, or targeted test runs.
 
Navigate to:
 
```
src/test/java/tests/
```
 
Available test classes:
 
- `StandardUserJourneyTest.java`
- `LoginErrorTest.java`
- `GlitchUserJourneyTest.java`
Run any `@Test` method directly from the IDE editor.
 
---
 
## Reporting Mechanism
 
After execution completes, an HTML report is automatically generated at the following path:
 
```
target/ExtentReport.html
```
 
The report includes:
 
- Full execution timestamps
- Per-test Pass/Fail/Skip status
- Step-by-step execution logs
- Inline assertion details
- Failure screenshots (Base64 embedded — no external file dependency)
---
 
## Test Execution Reports
 
> **How to add screenshots:** In GitHub's web editor, open this file for editing, then drag and drop your image directly into the editor at each placeholder location. GitHub will upload and link the image automatically. Replace the placeholder tag with the generated link.
 
---
 
### Report 1 — Overall Suite Execution Dashboard
 
 <img width="1901" height="864" alt="overall report " src="https://github.com/user-attachments/assets/a0f29ad9-0762-4b15-aff9-882d7e487ee9" />

---
 
### Report 2 — Q1: Verify Locked Out User
 
<img width="1919" height="868" alt="lockedoutuser" src="https://github.com/user-attachments/assets/0edfff8f-8915-488f-ab9f-6978f24d5eb4" />
 
---
 
### Report 3 — Q2: Standard User Journey
 
<img width="1919" height="863" alt="standereduser" src="https://github.com/user-attachments/assets/312cd670-531f-457e-aa83-0ad8dd9f7bdc" />

---
 
### Report 4 — Q3: Glitch User Journey
 <img width="1919" height="868" alt="glitchuser" src="https://github.com/user-attachments/assets/be104116-dba9-4f94-b3d0-4a74f4a2921b" />
 
---
 
## Key Features
 
| Feature | Description |
|---|---|
| Page Object Model Architecture | Clean separation of page logic and test cases |
| Scalable Framework Design | Easily extendable for new modules and pages |
| Dynamic Web Element Handling | Robust locator strategies with explicit waits |
| Clean Browser Session Execution | Incognito mode with suppressed popups |
| Exception Handling Validation | Negative test coverage for error flows |
| Automated HTML Reporting | ExtentReports with embedded screenshots |
| Screenshot Capture on Failure | Automatic capture at point of failure |
| Maven Integrated Build System | Dependency management and lifecycle control |
| TestNG Suite Execution | Grouped and sequential test orchestration |
| CI/CD Friendly Structure | Compatible with Jenkins, GitHub Actions, and similar tools |
 
---
 
## Project Structure
 
```
SauceDemoUISeleniumAutomation/
├── src/
│   ├── main/java/
│   │   ├── pages/               # Page Object classes
│   │   └── utils/               # Utility and helper classes
│   └── test/java/
│       └── tests/               # TestNG test classes
├── config.properties             # Environment configuration
├── testng.xml                    # TestNG suite definition
├── pom.xml                       # Maven build configuration
└── target/
    └── ExtentReport.html         # Generated execution report
```
 
---
 
## Author
 
**Sourav Dipto Apu**
 
B.Sc. in Software Engineering (2023–2027)
Daffodil International University (DIU)
 
---
 
## Repository
 
[https://github.com/TheSourav-001/SauceDemoUISeleniumAutomation](https://github.com/TheSourav-001/SauceDemoUISeleniumAutomation)
 
---
 
## Final Note
 
This framework is designed in alignment with real-world industry automation engineering practices. The architecture is intentionally kept modular and extensible, enabling straightforward integration into larger enterprise-grade test suites or CI/CD pipelines.
 
If this project has been useful to you, consider starring the repository on GitHub.
 
---
 
<div align="center">
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=14&pause=2000&color=9E9E9E&center=true&vCenter=true&width=600&lines=Built+with+precision.+Engineered+for+scale." alt="Footer" />
</div>

# Cylinder Volume Calculator & Password Strength Checker

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Testing](#testing)
- [Contact](#contact)

## Introduction
Welcome to the **Cylinder Volume Calculator & Password Strength Checker** project! This project consists of two main components:
1. A class to calculate the volume of a cylinder.
2. A class to assess the strength of a password based on various criteria.

## Features
- **Cylinder Volume Calculator**: Calculates the volume of a cylinder given its radius and height.
- **Password Strength Checker**: Evaluates the strength of passwords based on length, case diversity, and presence of special characters.

## Prerequisites
- Java 22 or higher.

## Installation
1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/my-project.git
    cd my-project
    ```

2. **Compile the project**:
    ```sh
    javac src/main/java/com/example/*.java
    ```

## Usage
- **Cylinder Volume Calculation**:
    ```java
    Cylinder cylinder = new Cylinder();
    double volume = cylinder.calculateVolume(5.0, 10.0);
    System.out.println("Volume: " + volume);
    ```

- **Password Strength Check**:
    ```java
    String strength = PasswordChecker.assessPasswordStrength("Example@123");
    System.out.println("Password Strength: " + strength);
    ```

## Testing
1. **Compile the test classes**:
    ```sh
    javac -cp .:junit-5.8.1.jar src/test/java/com/example/*.java
    ```

2. **Run the tests**:
    ```sh
    java -cp .:junit-5.8.1.jar org.junit.jupiter.api.TestEngine src/test/java/com/example/*.java
    ```

### Testing Files
- **Cylinder Volume Test Data**:
    - Place your CSV file (`cylinder_volume_data.csv`) in the `resources` folder.
- **Password Strength Test Data**:
    - Place your CSV files (`assessPasswordStrengthWithWeakPassword.csv`, `assessPasswordStrengthWithAveragePassword.csv`, `assessPasswordStrengthWithStrongPassword.csv`) in the `resources` folder.

## Contact
If you have any questions or feedback, feel free to reach out to me at ouambocanis@gmail.com.

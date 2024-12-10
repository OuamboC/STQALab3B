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
Welcome to the **Cylinder Volume Calculator & Password Strength Checker** project! This project consists of three main components:
1. A class to calculate the volume of a cylinder.
2. A class to assess the strength of a password based on various criteria.
3. A `Main` class to demonstrate the usage of the above components.

## Features
- **Cylinder Volume Calculator**: Calculates the volume of a cylinder given its radius and height.
- **Password Strength Checker**: Evaluates the strength of passwords based on length, case diversity, and presence of special characters.
- **Main Class**: Provides example usage of the Cylinder Volume Calculator and Password Strength Checker classes.

## Prerequisites
- Java 22 or higher.

## Installation
1. **Clone the repository:**
    ```sh
    git clone https://github.com/yourusername/STQALab3B.git
    cd STQALab3B
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

- **Example Main Class**:
    ```java
    public class Main {
        public static void main(String[] args) {
            // Example usage of the Cylinder class
            Cylinder cylinder = new Cylinder();
            System.out.println("Cylinder Volume: " + cylinder.calculateVolume(100, 40));

            // Example usage of the PasswordChecker class
            String password = "Hello!";
            String strength = PasswordChecker.assessPasswordStrength(password);
            System.out.println("Password Strength: " + strength);

            String password1 = "JavaDevs";
            String strength1 = PasswordChecker.assessPasswordStrength(password1);
            System.out.println("Password 1 Strength: " + strength1);

            String password2 = "CanisBrealOuamboIsReadyToHelpInTeamsAsSoftwareEngineer!";
            String strength2 = PasswordChecker.assessPasswordStrength(password2);
            System.out.println("Password 2 Strength: " + strength2);

            String password3 = "I am a Third Year Student BSc (Hons) Software Engineering at Manchester Metropolitan University.";
            String strength3 = PasswordChecker.assessPasswordStrength(password3);
            System.out.println("Password 3 Strength: " + strength3);

            String password4 = "I'm eager to contribute to innovative projects and collaborate with dynamic teams!";
            String strength4 = PasswordChecker.assessPasswordStrength(password4);
            System.out.println("Password 4 Strength: " + strength4);

            String password5 = "If You Interested Contact Me-via-email📧ouambocanis@gmail.com";
            String strength5 = PasswordChecker.assessPasswordStrength(password5);
            System.out.println("Password 5 Strength: " + strength5);

            String password6 = "TakeOfYourselfAndHopeToHearFromYouSoon.";
            String strength6 = PasswordChecker.assessPasswordStrength(password6);
            System.out.println("Password 6 Strength: " + strength6);
        }
    }
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
    - Place your CSV file (`calculateVolume.csv`) in the `resources` folder.
- **Password Strength Test Data**:
    - Place your CSV files (`assessPasswordStrengthWithWeakPassword.csv`, `assessPasswordStrengthWithAveragePassword.csv`, `assessPasswordStrengthWithStrongPassword.csv`) in the `resources` folder.

## Contact
If you have any questions or feedback, feel free to reach out to me at ouambocanis@gmail.com.

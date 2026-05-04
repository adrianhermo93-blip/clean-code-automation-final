# 🧼 Clean Code & Automation Cycle

## 📌 Project Overview

This project is part of the *Advanced Programming (Term 3)* course and aims to apply **Clean Code principles** by identifying and refactoring different *code smells*, while ensuring system functionality through automated testing using **Selenium WebDriver**.

The project contains two versions of the code:
- Original version with code smells
- Refactored version applying clean code best practices

---

## 📁 Project Structure

/src
├── main/java
│   ├── (system classes containing initial code smells)
│
├── test/java
│   ├── Selenium automated tests
│
/refactored
├── clean version of the code after refactoring

---

## 🎯 Objectives

- Detect and fix at least **10 different code smells**
- Apply **Clean Code and SOLID principles**
- Maintain system functionality without breaking behavior
- Validate functionality using **Selenium WebDriver**
- Properly use **IntelliJ IDEA refactoring tools**
- Maintain a clean Git history

---

## 🧠 Identified and Fixed Code Smells

### 1. Long Method
Long methods were broken down using *Extract Method* to improve readability and maintainability.

### 2. Large Class
Classes with too many responsibilities were split following the **Single Responsibility Principle (SRP)**.

### 3. Duplicate Code
Repeated code blocks were removed by creating reusable methods.

### 4. Dead Code
Unused code was eliminated to improve clarity and maintainability.

### 5. Switch Statements
Switch structures were replaced with **polymorphism using interfaces and classes**.

### 6. Temporary Fields
Unnecessary fields that were only used in specific cases were removed or refactored.

### 7. Divergent Change
Responsibilities that required modifying the same class for different reasons were separated into different classes.

### 8. Shotgun Surgery
Changes affecting multiple classes were reduced by centralizing logic where appropriate.

### 9. Feature Envy
Methods were moved to the classes where the data actually belongs.

### 10. Inappropriate Intimacy
Excessive coupling between classes was reduced using encapsulation and better abstraction.

---

## 🤖 Selenium Test Suite

Automated tests were implemented using **Selenium WebDriver** to validate the system functionality.

Features:
- Validation of main application workflows
- Use of assertions to verify expected results
- Automated browser-based testing
- Coverage of basic user scenarios

---

## 🔄 Git Workflow

The project follows a progressive development workflow:

1. Initial implementation containing code smells  
2. Identification of design problems  
3. Step-by-step refactoring process  
4. Integration of automated tests  
5. Final code cleanup and optimization  

---

## 🛠️ Tools & Technologies

- Java  
- IntelliJ IDEA  
- Selenium WebDriver  
- Git & GitHub  

---

## 📊 Results

After refactoring:
- Code is more readable and maintainable  
- Reduced code duplication  
- Better separation of responsibilities  
- Easier testing and debugging  
- Improved overall software structure  

---

## ✅ Conclusion

This project demonstrates the importance of identifying *code smells* early in development and applying controlled refactoring techniques.

Selenium tests ensure that structural improvements do not break existing functionality.

The final result is cleaner, more scalable, and professional-quality code.

# JDBC Bank Account Management System

A Java banking system using JDBC and MySQL with layered architecture (DAO pattern). Features account management with proper separation of concerns between model, DAO, and utility layers.
![Java](https://img.shields.io/badge/Java-17%2B-blue)
![MySQL](https://img.shields.io/badge/MySQL-8.0%2B-orange)
![JDBC](https://img.shields.io/badge/JDBC-4.2-green)

A complete banking system implementation using **Java JDBC** with **MySQL** database following **DAO (Data Access Object) pattern** with layered architecture.

## 🏗️ Project Structure

 - src/
  - main/
    - java/
      - com/wipro/
        - dao/ (Data Access Layer)
          - BankAccountDao.java (Interface)
          - BankAccountImpl.java (Implementation)
        - model/ (Entity Layer)
          - BankAccount.java
        - util/ (Utility Layer)
          - DatabaseConnection.java
          - DBPropertiesFile.java
        - main/ (Application Entry)
          - BankMain.java
    - resources/
      - db.properties (DB Configuration)

## 🚀 Features

- ✅ **CRUD Operations** for bank accounts
- ✅ **Secure DB Connection** management
- ✅ **Configuration via properties file**
- ✅ **Layered architecture** (DAO pattern)
- ✅ **Proper exception handling**

## 📋 Prerequisites

- Java 17+
- MySQL 8.0+
- MySQL Connector/J 8.0+

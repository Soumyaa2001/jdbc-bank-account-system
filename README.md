# 🏦 JDBC Bank Account Management System

<div align="center">
  <img src="https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExbTFodWR2OGJtMDF1cmhuM3d1ZHVib3d1MDVyOTQyZXFzMXV5ZHYyZSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/2IudUHdI075HL02Pkk/giphy.gif" width="200" alt="Secure Banking Animation">
  <p><em>Professional banking system with secure database operations</em></p>
</div>


![Java](https://img.shields.io/badge/Java-17+-blue?logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0+-orange?logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-4.2-green?logo=amazon-rds&logoColor=white)
![Architecture](https://img.shields.io/badge/Pattern-DAO-success)

## 🌟 Features

<div align="center">

| Feature | Description | Tech Used |
|---------|-------------|-----------|
| **Account Management** | Create, Read, Update, Delete accounts | JDBC CRUD |
| **Secure Connections** | Encrypted database communication | SSL/TLS |
| **Layered Architecture** | Separation of concerns | DAO Pattern |
| **Configurable** | Externalized configuration | .properties |
| **Error Handling** | Comprehensive exception management | Java Exceptions |

</div>

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

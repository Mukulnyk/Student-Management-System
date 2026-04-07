

# Student Management System

A web-based Student Management System built with Java, MySQL, and HTML/CSS.

## Technologies Used
- Java (Servlets)
- MySQL (Database)
- HTML/CSS (Frontend)
- Apache Tomcat (Server)

## Features
- Add new students
- Store student details (name, email, phone, course)
- Connected to MySQL database

## How to Run
1. Import project in Eclipse as Dynamic Web Project
2. Add MySQL Connector JAR to WEB-INF/lib
3. Create database using SQL script
4. Run on Apache Tomcat server
5. Open browser and go to http://localhost:8080/StudentManagement/index.html

## Database Setup
```sql
CREATE DATABASE student_management;
USE student_management;
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15),
    course VARCHAR(50)
);
```

## Project Structure
- DBConnection.java - Database connection class
- StudentServlet.java - Handles form submission
- index.html - Frontend UI

## Author
Mukulnyk

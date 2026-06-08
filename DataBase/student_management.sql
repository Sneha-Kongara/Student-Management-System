-- Student Management System Database

CREATE DATABASE IF NOT EXISTS student_management;

USE student_management;

-- Students Table

CREATE TABLE students (

    student_id INT AUTO_INCREMENT PRIMARY KEY,

    name VARCHAR(100) NOT NULL,

    course VARCHAR(100) NOT NULL,

    email VARCHAR(100),

    phone VARCHAR(20)

);

-- Sample Data

INSERT INTO students
(name, course, email, phone)

VALUES

('Rahul Kumar',
 'BCA',
 'rahul@gmail.com',
 '9876543210'),

('Anjali Sharma',
 'BSc',
 'anjali@gmail.com',
 '9876543211'),

('Rohan Patel',
 'BCom',
 'rohan@gmail.com',
 '9876543212');

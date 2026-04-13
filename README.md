Student,Emplpoyee,Product billing,& Management System
Student Name: Kajol

Date: 13-04-2026

Assignment: Individual Coding Project – Core Java & OOP

Project Overview This is a console-driven Java application built for an educational institute. The primary objective of this project is to manage student profiles, staff records, and product billing efficiently by applying core Object-Oriented Programming (OOP) concepts.

Architecture & File Structure (8 Modules) The application is modularized into 8 distinct Java files, each focusing on a specific user story and functionality:

Student.java: Manages basic student profiles and contains the logic to display their details.

studentName.java: Focuses on String manipulation, demonstrating methods like calculating string length and converting text cases (uppercase/lowercase).

marks.java: Utilizes an array data structure to securely hold and print the academic scores of five different students.

ProductBilling.java: Calculates total invoice amounts using method overloading, adapting to different quantities of purchased products.

employee.java: Manages staff data using constructors for initialization and static variables to share common information (like the Institute's Name) across all employee objects.

TestProduct.java: Demonstrates the concept of data hiding (encapsulation) by keeping product pricing variables private and accessing them strictly through getter and setter methods.

classifyStudent.java: Shows the parent-child relationship between classes, practically implementing inheritance.

main.java: The driver class of the application. It acts as the central execution point that links and runs all the modules together.

Execution Guide To run this application on your local machine, follow these steps:

Open your command prompt or terminal and navigate to the project directory.

Compile all the files at once using the command:

javac *.java

Execute the main program using the command:

java main

Key OOP Principles Highlighted: * Inheritance: Established a structural relationship between base and derived classes (e.g., Student to CollegeStudent).

Encapsulation: Secured sensitive data like product prices by using private access modifiers.

Polymorphism: Achieved compile-time polymorphism by overloading methods in the billing section.

Static Keyword: Optimized memory by sharing the institute's name at the class level rather than the object level.

Constructors: Used for clean and direct initialization of employee objects upon creation.

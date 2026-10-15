// Student and Employee Details Using Classes and Objects

class Student {

    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}


class Employee {

    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method
    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}


public class mainn {

    public static void main(String[] args) {

        // Student object
        Student s1 = new Student("Arun", 21);
        s1.displayStudent();

        System.out.println();

        // Employee object
        Employee e1 = new Employee("Janani", 15000);
        e1.displayEmployee();
    }
}
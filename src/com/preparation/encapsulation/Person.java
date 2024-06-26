package com.preparation.encapsulation;

public class Person {
    // Private fields (data)
    /*
        **Encapsulation** is an object-oriented programming principle that involves bundling data (attributes)
        * and methods (functions) that operate on the data into a single unit, usually a class.
        * It restricts direct access to some of the object's components, typically through access modifiers,
        * to protect the object's integrity and ensure controlled interaction with its data.
    */
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {  // Validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Public getter method for address
    public String getAddress() {
        return address;
    }

    // Public setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Public method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

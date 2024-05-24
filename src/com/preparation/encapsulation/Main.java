package com.preparation.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe", 30, "123 Main St");

        // Accessing and modifying private fields via public methods
        System.out.println("Initial Person Info:");
        person.displayInfo();

        // Modifying the fields using setters
        person.setName("Jane Doe");
        person.setAge(25);
        person.setAddress("456 Elm St");

        System.out.println("\nUpdated Person Info:");
        person.displayInfo();

        // Attempting to set an invalid age
        person.setAge(-5);  // Should display a validation message
    }
}

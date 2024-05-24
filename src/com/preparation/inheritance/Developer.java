package com.preparation.inheritance;

// Derived class
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Calling the constructor of the base class
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage + ".");
    }

    @Override
    public String toString() {
        return "Developer [Name=" + getName() + ", ID=" + getId() + ", Salary=" + getSalary() + ", Programming Language=" + programmingLanguage + "]";
    }
}

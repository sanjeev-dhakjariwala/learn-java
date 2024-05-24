package com.preparation.inheritance;

// Derived class
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary); // Calling the constructor of the base class
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the team.");
    }

    @Override
    public String toString() {
        return "Manager [Name=" + getName() + ", ID=" + getId() + ", Salary=" + getSalary() + ", Bonus=" + bonus + "]";
    }
}


package com.preparation.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 50000);
        Manager mgr = new Manager("Bob", 102, 70000, 10000);
        Developer dev = new Developer("Charlie", 103, 60000, "Java");

        System.out.println(emp);
        emp.work();

        System.out.println(mgr);
        mgr.work();

        System.out.println(dev);
        dev.work();
    }
}

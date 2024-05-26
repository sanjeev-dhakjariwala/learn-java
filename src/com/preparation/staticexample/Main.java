package com.preparation.staticexample;

public class Main {
    public static void main(String[] args) {
// Accessing static variable and method
        System.out.println("Initial static count: " + StaticExample.count);
        StaticExample.incrementCount();
        System.out.println("Static count after increment: " + StaticExample.count);

        // Creating objects to access instance variables and methods
        StaticExample example1 = new StaticExample();
        StaticExample example2 = new StaticExample();

        // Accessing instance variables and methods
        example1.incrementInstanceCount();
        System.out.println("example1 instanceCount: " + example1.instanceCount);
        System.out.println("Static count after example1 increment: " + StaticExample.count);

        example2.incrementInstanceCount();
        System.out.println("example2 instanceCount: " + example2.instanceCount);
        System.out.println("Static count after example2 increment: " + StaticExample.count);

        System.out.println("example1 instanceCount (unchanged): " + example1.instanceCount);
    }
}

package com.preparation.staticexample;

public class StaticExample {
    // static variable
    static int count = 0;

    // instance variable
    int instanceCount = 0;

    // static method
    public static void incrementCount() {
        count++;
        // instanceCount++; // This would cause a compilation error
    }

    // instance method
    public void incrementInstanceCount() {
        instanceCount++;
        count++;
    }
}

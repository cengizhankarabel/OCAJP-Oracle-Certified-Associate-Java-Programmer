package com.superclass;

public class SuperClass {
    private void displayName() {
          System.out.println("Super Class");
    }
    public static void main(String[] args) {
          SuperClass superClass = new SubClass();
          superClass.displayName();
    }
}

public class SubClass extends SuperClass {
    private void displayName() {
          System.out.println("SubClass is a type of SuperClass");
    }
}
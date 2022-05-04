package com.testingone;

interface MyInterface {
    void method1();
}

class MyImplementation implements MyInterface {
    void method1() {
          System.out.println("My Method");
    }
}

public class Testing1 {
    public static void main(String[] args) {
          MyInterface obj = new MyImplementation();
          obj.method1();
    }
}
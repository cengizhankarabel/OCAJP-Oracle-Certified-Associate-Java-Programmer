package com.mypack.demoTwo;
import com.mypack.demoOne.*;

public class Trainee {
    public static void main(String[] args) {
          Employee emp = new Employee();               //line 11 
          System.out.print(" "+ emp.id);               //line 12 
          System.out.print(" " + emp.name);            //line 13
          System.out.print(" "+ emp.role);             //line 14
    }
}
package com.student;

class Person{                      
    public Person(String name){  
           System.out.println(name);
  }
}

public class Student extends Person{
       public Student(){          //line 8            
              System.out.println("Student");
       }
       public static void main(String[] args) { // line 11 
             new Person("Bob");                
       }
}

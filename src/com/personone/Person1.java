package com.personone;

abstract class Person1 {
    public final void display(){
         System.out.println("Display method in Person");
    }
 
    public static void main(String[] args){
         Person1 person = new Student1();        //line 6
         person.display();                     //line 7           
        }
}

public class Student1 extends Person1{
       public void display(){                  //line 11
             System.out.println("Display method in Student");
       }
}

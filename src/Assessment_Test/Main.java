package Assessment_Test;


import java.util.*;

class Student{
    public String stuName;
    public int stuId;

    Student() {
        Random random = new Random();
        this.stuId= random.nextInt(100);
        System.out.println(stuId);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuId=" + stuId +
                '}';
    }
}

public class Main {
    public static void main(String[] args){

        { System.out.println("Feathers"); }

        Student st1 = new Student();
        st1.stuName = "Cengizhan";

        Student st2 = new Student();
        st2.stuName = "Selin";

        System.out.println(st1);
        System.out.println(st2);
        new Student();

        String first = "Theodore";
        String last = "Moose";
        String full = first + last;

        System.out.println(full);


    }
    { System.out.println("Snowy"); }
}

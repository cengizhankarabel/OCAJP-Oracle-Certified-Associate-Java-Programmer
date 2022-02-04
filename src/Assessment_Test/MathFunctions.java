package Assessment_Test;



public class MathFunctions {


    public static void addToInt(int x, int y) {
        System.out.println("x-> "+x+" y-> "+y);
         x = x + y;
        System.out.println("x-> "+x+" y-> "+y);

    }
    public static void main(String[] args) {

         int a = 15;
         int b = 10;

        MathFunctions.addToInt(a, b);
        System.out.println("a-> "+a+" b-> "+b);
        System.out.println(a);
    }
}


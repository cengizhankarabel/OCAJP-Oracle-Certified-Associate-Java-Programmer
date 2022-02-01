package Assessment_Test;

/*

What is the result of the following class? (Choose all that apply)
1: public class _C {
2: private static int $;
3: public static void main(String[] main) {
4: String a_b;
5: System.out.print($);
6: System.out.print(a_b);
7: } }
A. Compiler error on line 1.
B. Compiler error on line 2.
C. Compiler error on line 4.
D. Compiler error on line 5.
E. Compiler error on line 6.
F. 0null
G. nullnull

 */

public class Q1 {

    private static int $;
    public static void main(String[] args) {
        String a_b;     // -> Local variable need initialize
        System.out.println($);
        // System.out.println(a_b);

    }

}

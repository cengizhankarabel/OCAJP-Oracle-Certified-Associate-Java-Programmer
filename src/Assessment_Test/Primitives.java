package Assessment_Test;


public class Primitives {

    public static int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // and initialized here
        int reply = x + y;
        return reply;
    }




    public static void main(String[] args) {

        String name= "cengizhan";
        int len = name.length();

        System.out.println(valid());


        System.out.println(Integer.MAX_VALUE);
        long max = 2147483649L;
        System.out.println(max);
        System.out.println(Long.MAX_VALUE);

        int s = 056;
        System.out.println(s);
        System.out.println(0b10);


        double annoyingButLegal = 1_00_0.0_0; // this one compiles
        System.out.println(annoyingButLegal);
        double ss = 100___________00.0;
        System.out.println(ss);



    }
}

package Assessment_Test;

public class GarbageCollection {
    public static void main(String[] args) {

        String one, two;
        one = new String("a");
        System.out.println("one -> "+one);
        two = new String("b");
        System.out.println("two -> "+two);
        one = two;
        System.out.println("-----------one = two;------------");
        System.out.println("one -> "+one);
        System.out.println("two -> "+two);

        System.out.println("-----------String three = one;------------");
        String three = one;
        System.out.println("one -> "+one);
        System.out.println("two -> "+two);
        System.out.println("three -> "+three);
        one = null;
        System.out.println("-----------one = null;------------");
        System.out.println("one -> "+one);
        System.out.println("two -> "+two);
        System.out.println("three -> "+three);



    }

}

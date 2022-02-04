package Assessment_Test;

public class Q4 {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        int i = 1;
        while(count++ < 3) {
            System.out.println(i+" -> count: "+ count);
            i++;
            int y = (1 + 2 * count) % 3;
            System.out.println(i+" -> y: "+ y);
            switch(y) {
                default:
                    case 0: x -= 1;
                        System.out.println("case 0 calisti y -> "+y);break;
                    case 1: x += 5;
                        System.out.println("case 1 calisti y -> "+y);
                    }
            System.out.println(i+" -> x: "+ x);
            }
        System.out.println(x);
    }
}

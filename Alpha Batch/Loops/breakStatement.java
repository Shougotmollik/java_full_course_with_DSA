package Loops;

public class breakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            // when the number exit 3 the loop break and out.
            if (i==3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the Loop.");
    }
}

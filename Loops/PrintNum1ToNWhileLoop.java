package Loops;

import java.util.*;

public class PrintNum1ToNWhileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int counter=1;
            System.out.println("Enter the range: ");
            int range=sc.nextInt();
            while (counter<=range) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}

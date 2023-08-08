package Loops;

import java.util.*;

public class SumOfNaturalNumWhileLoop {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value for n : ");
            int n=sc.nextInt();
            int sum=0;
            int i=1;
            while (i<=n) {
                sum=sum+i;
                System.out.println("The sum is "+sum);
                i++;
            }
        }
    }
}

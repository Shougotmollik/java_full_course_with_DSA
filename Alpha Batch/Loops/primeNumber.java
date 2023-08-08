package Loops;

import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        /*
         prime number is just multiply by itself and 1.
         such as
            prime of 7 = 1*7
                         7*1
         */

         try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            if (n==2) {
                System.out.println("2 is prime number");
            } else {
                boolean isPrime=true;
                for(int i=2;i<=n-1;i++){
                    isPrime=false;
                }
                if (isPrime==true) {
                    System.out.println(n+" is prime number");
                } else {
                    System.out.println(n+" is not prime number");
                }
            }
        }
    }
}

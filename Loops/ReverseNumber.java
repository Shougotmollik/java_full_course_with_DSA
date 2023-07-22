package Loops;

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the Number : ");
            int number=sc.nextInt();
            while (number>0) {
                int lastDigit=number%10;
                System.out.print(lastDigit);
                number=number/10;
            }
            System.out.println();
        }  
    }
}

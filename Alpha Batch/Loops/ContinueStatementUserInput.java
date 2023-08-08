package Loops;

import java.util.*;

public class ContinueStatementUserInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Enter the number : ");
                int number=sc.nextInt();
                if (number%10==0) {
                    continue;
                }
                System.out.println("Your Number is "+number);
            } while (true);
        }
    }
}

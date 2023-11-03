package Loops;

import java.util.*;

public class breakStatmentUserInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                int number=sc.nextInt();
                System.out.println("Enter Your number : ");
                if (number%10==0) {
                    break;
                }
                System.out.println(number);
            } while (true);
        }
    }

}

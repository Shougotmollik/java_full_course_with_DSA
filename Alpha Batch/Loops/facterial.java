package Loops;

import java.util.*;

public class facterial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number=sc.nextInt();
            int fact=1;
            for (int i=1;i<=number;i++){
                fact *=i;
            }
            System.out.println(fact);
        }
    }
}

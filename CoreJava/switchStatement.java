package CoreJava;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        switch (number){
            case 1:
                System.out.println("MilkShake");
                break;
            case 2:
                System.out.println("Chocolate Shake");
                break;
            case 3:
                System.out.println("orange juice");
                break;
            case 4:
                System.out.println("Apple juice");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}

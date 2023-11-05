package CoreJava;

import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First Number :");
        int a=sc.nextInt();

        System.out.print("Enter Operator :");
        char operator=sc.next().charAt(0);

        System.out.print("Enter Second Number :");
        int b=sc.nextInt();


        switch (operator){
            case '+':
                System.out.println("Addition is "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction is "+(a-b));
                break;
            case '*':
                System.out.println("multiplication is "+(a*b));
                break;
            case '/':
                System.out.println("Division is "+(a/b));
                break;
            default:
                System.out.println("Invalid input ");
        }
    }
}
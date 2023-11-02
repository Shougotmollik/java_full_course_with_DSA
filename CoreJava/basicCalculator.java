package CoreJava;

import java.util.Objects;
import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1 : ");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        String oprator = sc.nextLine();

        if (Objects.equals(oprator, "+")) {
            System.out.println("The addition of two is "+(num1+num2));
        } else if (oprator=="-") {
            System.out.println("The subtraction of two number is "+(num1-num2));
        } else if (oprator=="*") {
            System.out.println();
        }
    }
}

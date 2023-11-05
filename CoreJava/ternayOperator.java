package CoreJava;

import java.util.Scanner;

public class ternayOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String isAdult= (age>=18)?"Adult":"Child";
        System.out.println(isAdult);
    }
}

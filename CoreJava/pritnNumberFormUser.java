package CoreJava;

import java.util.Scanner;

public class pritnNumberFormUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int counter=1;
        while (counter<=number){
            System.out.print(counter +" ");
            counter++;
        }
        System.out.println(" ");
    }
}

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        //input using next() ==> just a world
            // String input=sc.next();
            // System.out.println(input);

        //input using nextLine() ==> sentance or long strings
            // String input2=sc.nextLine();
            // System.out.println(input2);
        
        //input a integer number 
            int number =sc.nextInt();
            System.out.println(number);

        //input a float number 
            float price =sc.nextFloat();
            System.out.println(price);

        }
    }
}

import java.util.*;

public class PrintNumberPositiveNegative {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number=sc.nextInt();
            if (number>0) {
                System.out.println("Number is positive.");
            }
            else{
                System.out.println("Number is negative.");
            }
        }
    }
}

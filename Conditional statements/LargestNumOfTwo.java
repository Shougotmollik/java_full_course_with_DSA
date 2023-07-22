import java.util.*;

public class LargestNumOfTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            if (num1>num2) {
                System.out.println("Number 1 is Largest");
            }
            else{
                System.out.println("Number 2 is Largest.");
            }
        }
    }
}

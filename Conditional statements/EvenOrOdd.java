import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int Number=sc.nextInt();
            if (Number%2==0) {
                System.out.println(Number+" is Even.");
            }
            else{
                System.out.println(Number+" is Odd");
            }
        }

    }
}

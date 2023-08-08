import java.util.*;

public class averageOfThreeNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            float average=(float)((a+b+c)/2);
            System.out.println("Average is : "+average);
        }
    }
}

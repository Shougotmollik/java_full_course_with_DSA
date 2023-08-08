import java.util.*;

public class ElseIf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age=sc.nextInt();
            if (age>18) {
                System.out.println("You are Adult!");
            }
            else if (age>=13 && age<18) {
                System.out.println("You are Teenage!");
            }
            else{
                System.out.println("You are Child");
            }
        }

    }
}

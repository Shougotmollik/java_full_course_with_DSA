import java.util.*;

public class ifElseStatement {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age=sc.nextInt();
            if (age>18) {
                System.out.println("You are Adult!");
            }
            else{
                System.out.println("You are Not Adult!");
            }
        }
    }
}
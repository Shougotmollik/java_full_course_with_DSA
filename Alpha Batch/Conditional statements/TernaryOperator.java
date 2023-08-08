import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number=sc.nextInt();
            //ternary operator using check even and odd 
            String variable=((number%2)==0)?"Even":"Odd";
            System.out.println(variable);
        }
    }
}

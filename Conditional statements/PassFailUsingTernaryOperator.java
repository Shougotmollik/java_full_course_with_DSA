import java.util.*;

public class PassFailUsingTernaryOperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int mark=sc.nextInt();
            String result=(mark>33)?"Pass":"Fail";
            System.out.println("Your mark is "+mark+". you are "+result+".");
        }
    }
}

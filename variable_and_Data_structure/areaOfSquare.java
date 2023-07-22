import java.util.*;

public class areaOfSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float side=sc.nextFloat();
            float area=(float)(side*side);
            System.out.println("The Area of square is : "+area);
        }
    }
}

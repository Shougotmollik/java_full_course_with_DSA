import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the year : ");
            int year=sc.nextInt();
            boolean x = (year % 4) == 0;
            boolean y = (year % 100) != 0;
            boolean z = ((year % 100 == 0) && (year % 400 == 0));
            if (x && (y || z)){
                System.out.println(year+" is Leap Year.");
            }
            else{
                System.out.println(year+" is not Leap Year.");
            }
        }
    }
}

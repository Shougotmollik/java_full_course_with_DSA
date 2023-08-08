import java.util.*;

public class WeekNameGenaratorUsingSwitchStatements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the week number Between(1-7) : ");
            int weekNumber=sc.nextInt();
            switch (weekNumber){
                case 1:
                    System.out.println("monday");
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Satarday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("you are press the wrong key.");
            }
        }
    }
}

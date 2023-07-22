import java.util.*;

public class CalculatorUsingSwitchStatement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number 1 : ");
            int number1=sc.nextInt();
            System.out.println("Enter Operator ");
            char operator=sc.next().charAt(0);
            System.out.println("Enter Number 2 : ");
            int number2=sc.nextInt();
            switch(operator){
                case '+':
                    System.out.println(number1+number2);
                    break;
                case '-':
                    System.out.println(number1-number2);
                    break;
                case '*':
                    System.out.println(number1*number2);
                    break;
                case '/':
                    System.out.println(number1/number2);
                    break;
                case '%':
                    System.out.println(number1%number2);
                    break;
                default:
                    System.out.println("you are enter the wrong value.");
            }
        }
    }
}

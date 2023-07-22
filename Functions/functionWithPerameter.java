package Functions;

import java.util.*;

public class functionWithPerameter {
    //creating the function 
    public static int CalculateSum(int num1,int num2){ //paremeters
        int sum= num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            //call funtion
            int sum=CalculateSum(a, b); //arguments 
            System.out.println("sum is : "+sum);
        }
    }
}

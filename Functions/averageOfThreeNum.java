package Functions;
import java.util.*;
public class averageOfThreeNum {

   public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
       System.out.println("Enter first number : ");
       double a=sc.nextDouble();
       System.out.println("Enter second number : ");
       double b=sc.nextDouble();
       System.out.println("Enter Third number : ");
       double c=sc.nextDouble();
       System.out.println("The value is "+avgNum(a, b, c));

    }
   }
   
   //creating a function 
   public static double avgNum(double a,double b, double c){
    return (a+b+c)/3;
   }
}
package Functions;

public class FactorialOfNum {
    //creating function
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int fact=factorial(4); //giving value of n
        System.out.println("Factorial is " +fact);
    }
}

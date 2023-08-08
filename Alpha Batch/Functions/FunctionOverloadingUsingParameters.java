package Functions;

public class FunctionOverloadingUsingParameters {
    //function for calculate 2 numbers
    public static int sum(int a,int b){
        return a+b;
    }
    //function for calculate 4 numbers 
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args, int sum) {
        System.out.println(sum(4,4));
        System.out.println(sum(2,2,2,2));
    }
}

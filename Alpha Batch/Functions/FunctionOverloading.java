package Functions;
/*
 Function overloading ==>

 -multiple function with the same name but different perameters.
 */
public class FunctionOverloading {
    //function for integer value
    public static int multiply(int a,int b){
        return multiply(a, b);
    }
    //funtion for floating value 
    public static float multiply(float a,float b){
        return multiply(a, b);
    }
    //function for double value
    public static double multiply(double a,double b){
        return multiply(a, b);
    }
    //function for 3 integer value 
    public static int multiply(int a,int b,int c){
        return multiply(a, b, c);
    }

    public static void main(String[] args) {
        
    }
}

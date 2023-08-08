package Functions;

public class functionOverloadingUsingDatatype {
    //function for 2 interger 
    public static int sum(int a,int b){
        return a+b;
    }
    //function for 2 floating 
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(2.6f,5.4f));
    }
}

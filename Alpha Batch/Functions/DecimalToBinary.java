package Functions;

/**
 * InnerDecimalToBinary
 */
public class DecimalToBinary {
    public static void decToBin(int n){
        int myNum=0;
        int pow=0;
        int binNum=0;
        while(n>0){
            int lastdigit=n%2;
            binNum=binNum+(lastdigit*(int)Math.pow(10,pow));

            pow++;
            n=n/2;
        }
        System.out.println("Binary form of "+myNum+" = "+binNum);
    }
    public static void main(String[] args) {
        decToBin(7);
    }
    
}
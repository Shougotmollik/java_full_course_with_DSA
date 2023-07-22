package Functions;
public class BinaryToDecimal {
    //creating a function for convert binary to decimal 
    public static void BinToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int lastNum=binNum%10;
            decNum=decNum+(lastNum*(int)(Math.pow(2,pow)));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+myNum+" = "+decNum);
    }

    public static void main(String[] args) {
        BinToDec(101);
    }
}
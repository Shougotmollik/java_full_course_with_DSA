package Arrays;


public class LargestNumber {
    //creating a function 
    public static int getLargest(int number[]){
        int largest=Integer.MAX_VALUE;    //- infinity
        for (int i = 0; i < number.length; i++) {
            if (largest<number[i]) {
                largest=number[i];
            }
        }
        return largest;
    }
     public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7};
        System.out.println("The largest number is "+getLargest(number));
     }
}

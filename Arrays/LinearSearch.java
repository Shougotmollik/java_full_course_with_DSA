package Arrays;

public class LinearSearch {
    //creating a function 
    public static int leSrch(int numbers[],int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==key) {
                return i;
            }
        }
         return -1;
    }
    public static void main(String[] args) {
        int numbers[]={23,45,56,67,66,85,78,78,89};
        int key=66;

        int index=leSrch(numbers, key);
        if(index==-1){
            System.out.println("Print NOT found");
        }else{
            System.out.println("The index is "+index);
        }
    }
}

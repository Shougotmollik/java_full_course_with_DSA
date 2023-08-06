public class HollowRectangle {

    //creating a function
    public static void hollow_rectangle(int totRows, int totCols){
        // creating outer loop
        for (int i = 1; i <=totRows; i++) {
            // creating inner loop ==> columns
            for(int j=1;j<=totCols;j++){  // cell ==> (i,j)
                if(i==1||i==totRows||j==1||j==totCols){
                    //boundary cell 
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
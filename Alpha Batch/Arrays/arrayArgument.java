package Arrays;

public class arrayArgument {
    //creating a array functiin
    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[]agrs){
        int marks[]={97,89,87}; 
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
        System.out.println( );
    }
}

public class CharacterPattern {
    public static void main(String[]args){
        int n=4;
        char ch='A';
        //outter loop 
        for(int line=1;line<=n;line++){
            //inner loop 
            for(int alphabet=1;alphabet<=line;alphabet++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

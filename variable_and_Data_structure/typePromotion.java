public class typePromotion {
    public static void main(String[] args) {
/*
 type promotion in expressions 
 
 1.java automatically promotes each byte,short,or char operand to int when evaluting an expression.
 2.if one operand is long,float or double the whole expression i promoted to long ,float pr doluble respectively.
 
 */

        char a ='a';
        char b ='b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(a-b);
    }
}

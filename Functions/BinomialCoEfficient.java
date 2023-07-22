package Functions;

public class BinomialCoEfficient {
    //creating function for factorial 
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    //creating function for binomial cofficient 
    public static int binomialCoEfficient(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int facr_nmr=factorial(n-r);

        int binomialCoEfficient=fact_n/(fact_r*facr_nmr);
        return binomialCoEfficient;
    }
    public static void main(String[] args) {
        System.out.println(binomialCoEfficient(5, 2));
    }
}

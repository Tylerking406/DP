package DP;

/**
 * FibNaive
 * 
 * F(n) = F(n-1) + F(n-2)
 */
public class FibNaive {

    private static int Fib(int n){
        if (n<=1) 
            return n;
        else
            return Fib(n-1)+Fib(n-2);
    }


    public static void main(String[] args) {
        int n = 5;
        System.out.printf("Fib(%d)=%d",n,Fib(n));
        System.out.println();
    }
    
}
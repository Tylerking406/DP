/**
 * FibMemo
 */
public class FibMemo {

    private static int fib(int n){
        if(n<=1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.printf("Fib(%d)=%d\n",n,fib(n));
    }
}
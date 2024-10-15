import java.util.Arrays;

/**
 * FibMemo
 */
public class FibMemo {

    private static int fib(int n,int[] memo){
        if(n<=1)
            return n;
        if(memo[n]!= -1)
            return memo[n];
        else{
            memo[n]= fib(n-1,memo) + fib(n-2,memo);
            return memo[n];
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);

        System.out.printf("Fib(%d)=%d\n",n,fib(n,memo));
    }
}
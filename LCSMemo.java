import java.util.Arrays;

/**
 * LCSMemo
 */
public class LCSMemo {

    static int lcs(String s1, String s2, int m, int n,int[][] memo){
        
        if(m==0 || n==0)
            return 0;
        if (memo[m][n] != -1) 
            return memo[m][n];
           
        else if( s1.charAt(m-1) == s2.charAt(n-1))    
            return memo[m][n]= 1+lcs(s1, s2, m-1, n-1,memo);
        else{
            return  memo[m][n]=Math.max(lcs(s1, s2, m-1, n,memo), lcs(s1, s2, m, n-1,memo));
        }
    }


    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int m = s1.length(), n = s2.length();

        int[][] memo = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
        Arrays.fill(memo[i], -1);
            
        }
        System.out.println( lcs(s1, s2, m,n,memo));
    }
}
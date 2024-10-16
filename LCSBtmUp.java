/**
 * LongestCommonSubString
 */
public class LCSBtmUp {

    static int lcs(String s1, String s2){
        int m = s1.length(), n= s2.length();
        int[][] dp = new int[m+1][n+1]; //look up table
        // base case
        if (m == 0 || n== 0) 
            return 0;

       for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
                //if match
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                     dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                     dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
       }
       return dp[m][n];           
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int m = s1.length(), n = s2.length();
        System.out.println( lcs(s1, s2));
    }
}
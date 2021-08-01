import java.util.*;
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();

        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s.charAt(i)==t.charAt(j))
                    dp[i+1][j+1]=1+dp[i][j];
                else
                    dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[n][m]==s.length();
    }
}

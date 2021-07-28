import java.util.*;
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s==null || s.length()==0)
            return true;
        if(s.length()>t.length())
            return false;
        int n=t.length();
        int m=s.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(t.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return s.length()==dp[n][m];
    }
}

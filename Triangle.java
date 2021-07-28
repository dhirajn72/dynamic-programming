import java.util.*;
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<triangle.get(i).size();j++){
                dp[i][j]=triangle.get(i).get(j);
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j] += dp[i-1][j];
                }
                else if(i==j){
                    dp[i][j] += dp[i-1][j-1];
                }
                else{
                    dp[i][j] += Math.min(dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        int result = Integer.MAX_VALUE;
        for(int i:dp[n])
            result=Math.min(i,result);
        return result;
    }
}

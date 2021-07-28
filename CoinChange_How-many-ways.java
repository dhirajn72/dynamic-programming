public class CoinChange_How-many-ways{
    int coinChange(int[] coins,int amount){
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        dp[0][0]=1;
        for(int i=1;i<n;i++){
            dp[i][0]=1;
            for(int j=0;j<=amount;j++){
                if(j>=coins[i-1]){
                    dp[i][j]=dp[i-1][j-coins[i-1]]+dp[i-1][j]
                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n-1][amount];
    }
}

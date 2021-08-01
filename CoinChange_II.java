class Solution {
    /**
    This problem asks how many different ways the total ammount can be made
    **/
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        
        dp[0][0]=1;
        for(int i=1;i<n;i++){
            dp[i][0]=1;
            for(int j=1;j<=amount;j++){
                if(j>=coins[i-1])
                    dp[i][j]=dp[i-1][j] + dp[i][j-coins[i-1]];
                else
                    dp[i][j]=dp[i-1][j]+0;
            }
        }
        return dp[n-1][amount];

    }
}

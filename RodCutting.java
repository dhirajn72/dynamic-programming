public class RodCutting{
    public static int rodCutting(int[] prices){
        int n=prices.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++)
            dp[i][0]=0;

        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                if(i==0){
                    dp[i][j]=prices[i]+dp[i][j-i-1];
                }
                else if(j-i-1<0){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],prices[i]+dp[i][j-i-1]);
                }
            }
        }
        return dp[n-1][n];
    }
    public static void main(String[] args){
        int[] prices={2,5,7,8,7};
        //int[] prices={1,5,   8,   9,  10,  17,  17,  20};
        //int[] prices={3  , 5,   8,   9,  10,  17,  17,  20};
        //int[] prices={1, 5, 8, 9, 10, 17, 17, 20};
        //int[] prices={3, 5, 8, 9, 10, 17, 17, 20};
        //int[] prices={2, 3, 7, 8, 10};
        //int[] prices={2 ,7, 8, 25, 17, 28 ,30};
        System.out.println(rodCutting(prices));
    }
}

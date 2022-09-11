class Solution {
    public boolean stoneGame(int[] piles) {
<<<<<<< HEAD
=======
        if(piles==null||piles.length==0)
            return false;
>>>>>>> 0e3d8562d04613ffdc1b113431e603bb2673d872
        int n=piles.length;
        int[][] dp=new int[n][n];
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                int k=i+j;
                dp[j][k]=Math.max(piles[j]-dp[j+1][k],piles[k]-dp[j][k-1]);
            }
        }
<<<<<<< HEAD
        System.out.println(Arrays.deepToString(dp));
=======
>>>>>>> 0e3d8562d04613ffdc1b113431e603bb2673d872
        return dp[0][n-1]>0;
    }
}

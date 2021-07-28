class Solution {
    /*
    public int maximumSum(int[] arr) {
        if(arr==null||arr.length==0)
            return 0;
        int n=arr.length;
        int delete=arr[0],result=arr[0],keep=arr[0];
        for(int i=1;i<n;i++){
            delete=Math.max(keep,delete+arr[i]);
            keep=Math.max(keep+arr[i],arr[i]);
            result=Math.max(result,Math.max(keep,delete));
        }
        return result;
    }
    */

    public int maximumSum(int[] arr) {
        if(arr==null || arr.length==0)
            return 0;
        int n=arr.length;
        int k=1;
        int[][] dp=new int[n+1][k+1];
        for(int i=0;i<=k;i++){
            dp[0][i]=Integer.MIN_VALUE;
        }
        int result=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            for(int j=0;j<=k;j++){
                if(dp[i-1][j]>0){
                    dp[i][j]= Math.max((j-1>=0 ?  dp[i-1][j-1] : Integer.MIN_VALUE), dp[i-1][j]+arr[i-1]);
                }
                else{
                    dp[i][j]=arr[i-1];
                }
                result=Math.max(result,dp[i][j]);
            }
        }
        return result;
    }
}

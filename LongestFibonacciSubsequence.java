class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        if(arr==null|| arr.length==0)
            return 0;
        int result=0;
        int[][] dp=new int[arr.length][arr.length];
        for(int i=1;i<arr.length;i++){
            int l=0;
            int r=i-1;
            while(l<r){
                int sum=arr[l]+arr[r];
                if(sum<arr[i]){
                    l++;
                }
                else if(sum>arr[i]){
                    r--;
                }
                else{
                    dp[r][i]=dp[l][r]+1;
                    result=Math.max(result,dp[r][i]);
                    l++;
                    r--;
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return result==0?result:result+2;
    }
}

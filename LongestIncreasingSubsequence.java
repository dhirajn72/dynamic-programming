class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length-1;

        int[] dp=new int[nums.length];
        for(int i=0;i<=n;i++)
            dp[i]=1;

        int result=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
                result=Math.max(result,dp[i]);
            }
        }
        return result;
        
    }
}

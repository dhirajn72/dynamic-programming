class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            if(dp[i-1]>0)
                dp[i] = nums[i]+dp[i-1];
            else
                dp[i]=nums[i];
        }
        int max=Integer.MIN_VALUE;
        for(int e:dp)
            max=Math.max(e,max);
        return max;
        
    }
}

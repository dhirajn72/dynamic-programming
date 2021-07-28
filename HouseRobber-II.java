class Solution {
    public int rob(int[] nums) {
        if(nums.length<=1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        int n=nums.length;
        int[] dp1=new int[n+1];
        int[] dp2=new int[n+1];
        for(int i=2;i<=n;i++){
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+nums[i-2]);
        }
        for(int i=2;i<=n;i++){
            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i-1]);
        }
        return Math.max(dp1[n],dp2[n]);
    }
}

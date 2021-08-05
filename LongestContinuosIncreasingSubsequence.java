class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i;j<n-1;j++){
                if(nums[j+1]>nums[j])
                    count++;
                else
                    break;
            }
            result=Math.max(result,count);
        }
        return result;
        
    }
}

class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        int[][] dp=new int[n][n];
        
        for(int i=0;i<=target;i++){
            for(int j=0;j<nums.length;j++){
                if(dp[i][j-nums[i]]<=target){
                    dp[i][j-nums[i]] + = dp[i][j];
                }
            }
        }

    }
}

    /*

    //This backtracking solution is fine for small inputs, but throw TLE for large input
    // ex: [4,2,1] 32
    int result=0;
    public int combinationSum4(int[] nums, int target) {
       backtrack(nums,new ArrayList<>(),target,0);
       return result;
    }
    void backtrack(int[] nums,List<Integer> list,int target,int start){
        if(start==nums.length)
            return;
        int sum=0;
        for(int e:list){
            sum+=e;
        }
        if(sum==target){
            result++;
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            backtrack(nums,list,target,start);
            list.remove(list.size()-1);
        }
    }
    */
}

class Solution {
    public int longestArithSeqLength(int[] nums) {
        if(nums==null || nums.length<2)
            return 0;

        Map<Integer,Integer>[] map = new HashMap[nums.length];
        Arrays.fill(map,new HashMap<>());
        int result=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int diff=nums[i]-nums[j];
                int seq=map[j].getOrDefault(diff,1);
                map[j].put(diff,seq+1);
                result=Math.max(map[j].get(diff),result);
            }
        }
        return result;
    }
}


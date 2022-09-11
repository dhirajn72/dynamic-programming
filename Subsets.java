class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if(nums==null||nums.length==0)
            return  result;
        List<Integer> list=new ArrayList<>();
        for(int e:nums)
            list.add(e);
        findSubsets(list,new ArrayList<>());
        return result;
    }
    void findSubsets(List<Integer> list,List<Integer> partial){
        result.add(new ArrayList<>(partial));
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> remaining=new ArrayList<>();
            int e=list.get(i);
            for(int j=i+1;j<list.size();j++){
                remaining.add(list.get(j));
            }
            ArrayList<Integer> partial_res=new ArrayList<>(partial);
            partial_res.add(e);
            findSubsets(remaining,partial_res);
        }
    }
}

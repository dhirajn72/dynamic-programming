class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n=satisfaction.length;
        int result=0;
        int total=0;
        Arrays.sort(satisfaction);
        for(int i=n-1;i>=0 && satisfaction[i]> -total;i--){
            total += satisfaction[i];
            result += total;
        }
        return result;
    }
}

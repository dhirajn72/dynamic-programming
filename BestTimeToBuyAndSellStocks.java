class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0)
            return 0;

        int n=prices.length;
        int[] dp=new int[n];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}

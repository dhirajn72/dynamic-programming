import java.util.Arrays;
class MinimumCostForTickets{
    public static void main(String[] args){
        int[] days={1,4,6,7,8,20};
        int[] costs={2,7,15};
        System.out.println(mincostTickets(days,costs));
    }
    public static int mincostTickets(int[] days, int[] costs) {
        boolean[] isTravelDay= new boolean[366];
        for(int day:days){
            isTravelDay[day]=true;
        }
        int[] dp=new int[366];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1;i<=365;i++){
            if(!isTravelDay[i]){
                dp[i]=dp[i-1];
                continue;
            }
            dp[i]=Math.min(dp[i],dp[i-1]+costs[0]);
            if(i-7>=0){
                dp[i]=Math.min(dp[i],dp[i-7]+costs[1]);
            }
            else{
                dp[i]=Math.min(dp[i],costs[1]);
            }
            if(i-30>=0){
                dp[i]=Math.min(dp[i],dp[i-30]+costs[2]);
            }
            else{
                dp[i]=Math.min(dp[i],costs[2]);
            }
        }
        return dp[365];
    }
}

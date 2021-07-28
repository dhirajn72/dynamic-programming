class Solution {
    public int numTeams(int[] rating) {
       int n=rating.length;
       int count=0;
       int[] dp=new int[n];
       for(int i=0;i<n;i++){
           for(int j=i;j>=0;j--){
               if(rating[i]>rating[j]){
                   dp[i]++;
                   count+=dp[j];
               }
           }
       }
       dp=new int[n];
       for(int i=0;i<n;i++){
           for(int j=i;j>=0;j--){
               if(rating[i]<rating[j]){
                   dp[i]++;
                   count+=dp[j];
               }
           }
       }
       return count;
    }
}

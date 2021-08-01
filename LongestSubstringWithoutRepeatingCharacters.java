class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null ||s.isEmpty())
            return 0;
        if(s.length()==1)
            return 1;
        int[] dp=new int[130];
        Arrays.fill(dp,Integer.MIN_VALUE);

        int max=0;
        int l=0;
        int r=s.length();
        while(l<r){
            for(int i=l;i<r;i++){
                char ch=s.charAt(i);
                if(dp[ch]!=Integer.MIN_VALUE){
                    int count=0;
                    for(int j=0;j<dp.length;j++){
                        if(dp[j]!=Integer.MIN_VALUE)
                            count++;
                    }
                    max=Math.max(max,count);
                    for(int j=0;j<dp.length;j++)
                        dp[j]=Integer.MIN_VALUE;

                    break;
                }
                else{
                    dp[ch]=ch;
                }
            }
             l++;
        }
       return max; 
    }
}

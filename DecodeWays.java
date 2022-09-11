class Solution {
    public int numDecodings(String s) {
<<<<<<< HEAD
        if(s==null||s.length()==0)
            return 0;
        int result=0;
        int[] dp=new int [s.length()+1];
        dp[0]=1;
        dp[1]=s.charAt(0)=='0' ? 0:1;
        for(int i=2;i<s.length();i++){
            int oneDigit=Integer.valueOf(s.substring(i-1,i));
            int twoDigit=Integer.valueOf(s.substring(i-2,i));
            if(oneDigit>=1){
                dp[i] += dp[i-1]; 
            }
            if(twoDigit>=10 && twoDigit<=26){
                dp[i] += dp[i-1];
            }
        }
        return dp[s.length()-1];
=======
        if(s==null)
            return 0;
        int n=s.length();
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=s.charAt(0)=='0'? 0 : 1;
        for(int i=2;i<=n;i++){
            int one=Integer.valueOf(s.substring(i-1,i));
            int two=Integer.valueOf(s.substring(i-2,i));
            if(one>=1)
                dp[i]+=dp[i-1];
            if(two>=10 && two<=26)
                dp[i]+=dp[i-2];
        }
        return dp[n];
>>>>>>> 0e3d8562d04613ffdc1b113431e603bb2673d872
    }
}

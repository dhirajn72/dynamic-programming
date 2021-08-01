class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.isEmpty())
            return s;

        int n=s.length();
        int start=0;
        int maxLen=0;
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
            maxLen=1;
        }
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                dp[i-1][i]=true;
                maxLen=2;
            }
        }

        for(int i=3;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                int k=i+j-1;
                if(s.charAt(j)==s.charAt(k) && dp[j+1][k-1]){
                    dp[j][k]=true;
                    if(i>maxLen){
                        start=j;
                        maxLen=i;
                    }
                }
            }
        }
        return s.substring(start,start+maxLen);
   }
}

class Solution {
    public int countSubstrings(String s) {
        if(s==null||s.length()==0)
            return 0;
        int n=s.length();
        int count=0;
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
            count++;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                count++;
            }
        }
        for(int i=3;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                int k=i+j-1;
                if(s.charAt(j)==s.charAt(k) && dp[j+1][k-1]){
                    dp[j][k]=true;
                    count++;
                }
            }
        }
        return count;
    }
}

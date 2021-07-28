class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<Integer> getRow(int numRows) {
        if(numRows==0)
            return result; 
        int[][] dp=new int[numRows+1][numRows+1];
        for(int i=0;i<=numRows;i++){
            dp[i][i]=1;
        }
        for(int i=0;i<=numRows;i++){
            dp[i][0]=1;
        }
        for(int i=2;i<=numRows;i++){
            for(int j=1;j<i;j++){
                dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
            }
        }
        for(int i=0;i<numRows;i++){
            List<Integer> rows=new ArrayList<>();
            for(int j=0;j<=i;j++){
                rows.add(dp[i][j]);
            }
            result.add(rows);
        }
        return result.get(numRows);
   }
}

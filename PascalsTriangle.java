class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        int[][] dp=new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            dp[i][i]=1;
        }
         for(int i=0;i<numRows;i++){
            dp[i][0]=1;
        }
        for(int i=2;i<numRows;i++){
            for(int j=1;j<i;j++){
                dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
            }
        }
        for(int i=0;i<dp.length;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++)
                row.add(dp[i][j]);
            result.add(row);
        }
        return result;
    }
}

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                    matrix[i][j] += Math.min(matrix[i-1][j],matrix[i-1][j+1]);
                }
                else if(j==(m-1)){
                    matrix[i][j] += Math.min(matrix[i-1][j],matrix[i-1][j-1]);
                }
                else{
                    matrix[i][j] += Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j],matrix[i-1][j+1]));
                }
            }
        }
        int res=Integer.MAX_VALUE;
        for(int row:matrix[n-1]){
            res=Math.min(res,row);
        }
        return res;
   }
}

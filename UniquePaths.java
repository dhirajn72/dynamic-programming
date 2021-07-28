class Solution {
    public int uniquePaths(int n, int m) {
        int[][] chess=new int[n][m];
        for(int i=0;i<m;i++){
            chess[0][i]=1;
        }
        for(int i=0;i<n;i++){
            chess[i][0]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                chess[i][j] = chess[i-1][j]+chess[i][j-1];
            }
        }
        return chess[n-1][m-1];
    }
}

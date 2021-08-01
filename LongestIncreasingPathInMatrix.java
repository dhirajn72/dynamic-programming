class Solution {
    int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0)
            return 0;
        int n=matrix.length, m=matrix[0].length, longestPath=0;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int longest=longestIncreasingPath(matrix,dp,n,m,i,j);
                longestPath=Math.max(longestPath,longest);
            }
        }
        return longestPath;
    }
    int longestIncreasingPath(int[][] matrix,int[][] dp,int n,int m,int i,int j){
        //Cache the solutions into dp table, this will reduce the previous calls
        // and it will improve the time complexity of the algorithm.
        if(dp[i][j]>0)
            return dp[i][j];

        int max=0;
        for(int[] direction:directions){
            /*
            Make new x,y coordinates to check the valid coordinates to visit;
            Also put validations to check the invalid boundaries.
            */
            int x=direction[0]+i , y=direction[1]+j;
            if(x>-1 && y>-1 && x<n && y<m && matrix[x][y]>matrix[i][j]){
                int longest=longestIncreasingPath(matrix,dp,n,m,x,y);
                max=Math.max(max,longest);
            }
        }
        dp[i][j]=max+1;
        return dp[i][j];
    }
}

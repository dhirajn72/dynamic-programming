class Solution {
    int[][] directions=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        int result=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] cache=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int largest=longestPath(matrix,n,m,i,j,cache);
                result=Math.max(result,largest);
            }
        }
        return result;
    }

    int longestPath(int[][] matrix,int n,int m,int i,int j,int[][] cache){
        if(cache[i][j]>0)
            return cache[i][j];

        int max=0;
        for(int[] direction:directions){
            int x=i+direction[0],y=j+direction[1];
            if(x>-1 && x<n && y>-1 && y<m &&  matrix[x][y]>matrix[i][j]){
                int largest=longestPath(matrix,n,m,x,y,cache);
                max=Math.max(max,largest);
            }
        }
        cache[i][j]=max+1;
        return cache[i][j];
    }
}

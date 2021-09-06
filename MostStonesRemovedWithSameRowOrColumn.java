class Solution {
    int result=0;
    int[][] dp;
    public int removeStones(int[][] stones) {
        Set<Integer> set=new HashSet<>();
        for(int[] vertex:stones){
            set.add(vertex[0]);
            set.add(vertex[1]);
        }
        int n=set.size();
        int[][] matrix=new int[n][n];
        dp=new int[n][n];
        for(int[] vertex:stones){
            matrix[vertex[0]][vertex[1]]=1;
            dp[vertex[0]][vertex[1]]=1;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(matrix[i][j]==1){
                    boolean res=findInRow(matrix,i,j);
                    if(res)
                        continue;
                    findInColumn(matrix,i,j);
                    
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return result;
    }
    boolean findInRow(int[][] matrix,int x,int y){
       for(int i=y-1;i>=0;i--){
            if(matrix[x][i]==1){
                dp[x][y]=0;
                result++;
                return true;
            }

        }
        return false;
    }
    void findInColumn(int[][] matrix,int x,int y){
        for(int i=x-1;i>=0;i--){
            if(matrix[i][y]==1){
                dp[x][y]=0;
                result++;
                return;
            }
        }
    }
}

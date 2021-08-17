class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int n=dungeon.length;
        int m=dungeon[0].length;
        
        for(int i=1;i<n;i++){
            dungeon[i][0] += dungeon[i-1][0];
        }
        for(int j=1;j<m;j++){
            dungeon[0][j] += dungeon[0][j-1];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dungeon[i][j] += Math.abs(dungeon[i-1][j]) < Math.abs(dungeon[i][j-1]) ? dungeon[i-1][j] : dungeon[i][j-1];
            }
        }
        return dungeon[n-1][m-1] < 0 ? Math.abs(dungeon[n-1][m-1]) + 1 : dungeon[n-1][m-1]; 
        
    }
}

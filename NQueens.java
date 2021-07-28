import java.util.*;
class Solution {
    List<List<String>> result=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[][] chess=new int[n][n];
        solveNQueens(chess,"",0);
       // System.out.println(Arrays.deepToString(chess));
        return result;
    }
    void solveNQueens(int[][] chess,String qsf,int row){
        if(row==chess.length){
            System.out.println(qsf+".");
            //printRows(chess.length,r,c);
            return;
        }
        for(int col=0;col<chess[row].length;col++){
            if(isItSafePlaceForQueen(chess,row,col)){
                chess[row][col]=1;
                solveNQueens(chess,qsf+row+"-"+col+",",row+1);
                chess[row][col]=0;
            }
        }
    }
    boolean isItSafePlaceForQueen(int[][] chess,int row,int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1)
                return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1)
                return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]==1)
                return false;
        }
        System.out.println(Arrays.deepToString(chess));
        return true;
    }
    void printRows(int n,int row,int col){
        String[][] matrix=new String[n][n];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=".";
            }
        }
        matrix[row][col]="Q";
        System.out.println(Arrays.toString(matrix[row]));
    }
}

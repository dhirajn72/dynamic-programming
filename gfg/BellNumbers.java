import java.util.Arrays;
public class BellNumbers{
    static public void bellNumbers(int n){
        int[][] dp = new int[n][n];
        dp[0][0] = 1;
        for(int i = 1; i < n; i++){
            dp[i][0] = dp[i - 1][i - 1];
            for(int j = 1; j <= i; j++){
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
            }
        }
        for(int[] row : dp){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args){
        bellNumbers(10);
    }
}

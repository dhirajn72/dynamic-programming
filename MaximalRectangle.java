class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null||matrix.length==0)
            return 0;
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=Integer.valueOf(matrix[i][j]+"");
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(dp[i][j]!=0){
                    dp[i][j] += dp[i-1][j];
                }
            }
        }
        int result=Integer.MIN_VALUE;
        for(int[] rows:dp){
            result=Math.max(result,histogram(rows));
        }
        return result;
    }
    int histogram(int[] arr ){
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]>=arr[i])
                    count++;
                else
                    break;
            }
            for(int j=i-1;j>=0;j--){
                if(arr[i]<=arr[j])
                    count++;
                else
                    break;
            }
            max=Math.max(max,count*arr[i]);
        }
        return max;
    }
}

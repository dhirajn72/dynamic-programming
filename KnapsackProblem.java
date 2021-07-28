public class KnapsackProblem{
    public static int knapsack(int[] val,int[] weight,int w){
        int[][] k=new int[val.length+1][w+1];
        for(int i=0;i<=val.length;i++){
            for(int j=1;j<=w;j++){
                /*
                First row and first column fill with zeros. 
                */
                if(i==0||j==0){
                    k[i][j]=0;
                    continue;
                }
                /*
                From 1 row, look for the previous row, and subtract the amout from total weight.
                */
                if(j-weight[i-1]>=0){
                    k[i][j]=Math.max(k[i-1][j],k[i-1][j-weight[i-1]] + val[i-1]);
                }
                /*
                Otherwise just take the, previous value and keep in the current cell.
                */
                else{
                    k[i][j]=k[i-1][j];
                }
            }
        }
        //return the last row, and last column value.
        return k[val.length][w];
    }
    public static void main(String args[]){
        int val[] = {1,4,5,7};
        int weight[] = {1,3,4,5};
        int w=7;
        System.out.println(knapsack(val,weight,w));
    }
}

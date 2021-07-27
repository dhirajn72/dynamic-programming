public class KnapsackProblem{
    public static int knapsack(int[] val,int[] weight,int w){
        int[][] k=new int[val.length+1][w+1];
        for(int i=0;i<=val.length;i++){
            for(int j=1;j<=w;j++){
                if(i==0||j==0){
                    k[i][j]=0;
                    continue;
                }
                if(j-weight[i-1]>=0){
                    k[i][j]=Math.max(k[i-1][j],k[i-1][j-weight[i-1]] + val[i-1]);
                }
                else{
                    k[i][j]=k[i-1][j];
                }
            }
        }
        return k[val.length][w];
    }
    public static void main(String args[]){
        int val[] = {1,4,5,7};
        int weight[] = {1,3,4,5};
        int w=7;
        System.out.println(knapsack(val,weight,w));
    }
}

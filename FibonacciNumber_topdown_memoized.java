public class FibonacciNumber_topdown_memoized{
    static int fibonacci(int n){
        int[] dp=new int[n+1]; 
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        System.out.println(fibonacci(15));
        System.out.println(fibonacci(16));
        System.out.println(fibonacci(17));
        System.out.println(fibonacci(18));
    }
}

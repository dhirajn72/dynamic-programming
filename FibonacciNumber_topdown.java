public class FibonacciNumber_topdown{
    static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        System.out.println(fibonacci(15));
        System.out.println(fibonacci(16));
        System.out.println(fibonacci(17));
        System.out.println(fibonacci(18));
    }
}

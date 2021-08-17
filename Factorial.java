import java.util.*;
public class Factorial{
    static Map<Integer,Integer> map=new HashMap<>();
    public static int factorial(int n){
        if(map.containsKey(n))
            return map.get(n);
        if(n==0||n==1)
            return 1;

        int fact=n*factorial(n-1);
        map.put(n,fact);
        return fact;
    }

    public static void main(String[] args){
        System.out.println(factorial(7));
    }
}

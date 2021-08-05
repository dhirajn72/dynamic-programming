import java.util.*;
public class LongestCommonSubstring{
    static String longestCommonSubstring(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n+1][m+1];

        int max=0;
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i+1][j+1]=1+dp[i][j];
                    if(dp[i+1][j+1]>max){
                        max=dp[i+1][j+1];
                        x=i+1;
                        y=j+1;
                    }
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(;x>0 && y>0;){
            if(s1.charAt(x-1)==s2.charAt(y-1))
                sb.append(s1.charAt(x-1));
            x--;
            y--;
        }
        return sb.reverse().toString() ;
    }
    public static void main(String[] args){
        String s1=args[0];
        String s2=args[1];
        System.out.println(longestCommonSubstring(s1,s2));
    }
}

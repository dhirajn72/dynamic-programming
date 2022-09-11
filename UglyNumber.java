/*
This is working solution for small numbers, but throws TLE on Leetcode
*/
class Solution {
    public boolean isUgly(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int next_2 = 2, next_3 = 3, next_5 = 5;
        for(int i = 1; i <= n ; i++){
            int next = Math.min(next_2, Math.min(next_3, next_5));
            dp[i] = next;
            if(next == next_2){
                i2 = i2 + 1;
                next_2 = dp[i] * 2;
            }
            if(next == next_3){
                i3 = i3 + 1;
                next_3 = dp[i] * 3;
            }
            if(next == next_5){
                i5 = i5 + 1;
                next_5 = dp[i] * 5;
            }
            if(dp[i] == n) return true;
        }
        return false;
    }
}


/*

Accepted on Leetcode.

*/
class Solution {
    public boolean isUgly(int n) {
        while(n!=1){
            if(n%2==0)
                n = n/2;
            else if(n%3==0)
                n = n/3;
            else if(n%5==0)
                n = n/5;
            else 
                return false;
        }
        return true;
    }
}

class Solution {
    public int[] countBits(int n) {
        int[] result=new int[n];
        for(int i=0;i<=n;i++){
            result[i]=getOnes(i);
        }
        return result;
    }
    int getOnes(int n){
        int ones=0;
        while(n!=0){
            ones=ones+n%2;
            n=n/2;
        }
        return ones;
    }
}

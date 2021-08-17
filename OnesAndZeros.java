class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        //Brute force 
        
        int result=0;
        for(int i=0;i<strs.length;i++){
            String element=strs[i];
            int ones=0,zeros=0;
            boolean flag=true;
            for(int j=0;j<element.length();j++){
                char c=element.charAt(j);
                int digit=Integer.valueOf(c+"");
                if(digit==1)
                    ones++;
                else
                    zeros++;

                if(ones>n || zeros>m){
                    flag=false;
                    break;
                }
            }
            if(flag){
                result++;
            }
        }
        return result;
        
    }
}

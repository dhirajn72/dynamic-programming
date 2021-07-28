class Solution {
    public int numSplits(String s) {
        if(s==null||s.length()==0)
            return 0;
        Set<Character> set=new HashSet<>();
        int n=s.length();
        int[] left=new int[n];
        int[] right=new int[n];
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
            left[i]=set.size();
        }
        set.clear();
        for(int i=s.length()-1;i>=0;i--){
            set.add(s.charAt(i));
            right[i]=set.size();
        }
        int result=0;
        for(int i=0;i<left.length-1;i++){
            if(left[i]==right[i+1])
                result++;
        }
        return result;
    }
}

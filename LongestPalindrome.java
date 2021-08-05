class Solution {
    public int longestPalindrome(String s) {
        if(s==null||s.isEmpty())
            return 0;

        int n=s.length()-1;
        int len=0;
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                len+=2;
                set.remove(c);
            }
            else
                set.add(c);
        }
        int size=set.size();
        return set.size() > 0 ? len+1:len;
        
    }
}

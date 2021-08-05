class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(d,(a,b)-> a.length()==b.length() ? a.compareTo(b) : b.length()-a.length());
        for(String word:dictionary){
            if(isSubsequence(word,s)){
                return word;
            }
        }
        return "";
    }
    boolean isSubsequence(String word,String s){
        int i=0;
        int j=0;
        for(i<word.length() && j<s.length()){
            if(word.charAt(i)==s.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i>=word.length();
    }
}

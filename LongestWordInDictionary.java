class Solution {
    public String longestWord(String[] words) {
        int n=words.length;
        Arrays.sort(words);
        Set<String> set=new HashSet<>();
        String result="";
        for(String word:words){
            int wordLen=word.length();
            if(wordLen==1 || set.contains(word.substring(0,wordLen-1))){
                set.add(word);
                if(wordLen>result.length())
                    result=word;
            }
        }
        return result;
    }
}

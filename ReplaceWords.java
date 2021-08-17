class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        StringBuilder sb=new StringBuilder();
        Trie obj=new Trie();
        for(String word:dictionary){
            obj.insert(word);
        }
        String[] words=sentence.split(" ");
        for(String word:words){
            Node found=obj.search(word);
            if(found==null){
                sb.append(word).append(" ");
            }
            else if(found.isWord){
                sb.append(found.word).append(" ");
            }
        }
        sb.delete(sb.length()-1,sb.length());
        return sb;
    }


        class Trie{
            Node root;
            void insert(String word){
                Node curr=root;
                for(int i=0;i<word.length();i++){
                    char c=word.charAt(i);
                    if(curr.children[c-'a']==null)
                        curr.children[c-'a']=new Node(c);
                    curr=curr.children[c-'a'];
                }
                curr.isWord=true;
            }
            boolean search(String word){
                Node node=getNode(word);
                return node!=null && node.isWord;
            }
            boolean prefix(String word){
                return getNode(word)!=null;
            }
            Node getNode(String word){
                Node curr=root;
                for(int i=0;i<word.length();i++){
                    char c=word.charAt(i);
                    if(curr.children[c-'a']==null)
                        return null;
                    curr=curr.children[c-'a'];
                    if(curr.isWord)
                        return curr;
                }
                return curr;
            }
            class Node{
                char c;
                boolean isWord;
                Node[] children;
                Node(char c){
                    this.c=c;
                    this.isWord=false;
                    this.children=new Node[26];
                }
            }
        }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
            return null;

        int n=strs.length;
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[n-1];
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i<first.length() && j<last.length()){
            if(first.charAt(i)==last.charAt(j)){
                sb.append(first.charAt(i)+"");
                i++;
                j++;
            }
            else
                break;
        }
        return sb.toString();
    }
}

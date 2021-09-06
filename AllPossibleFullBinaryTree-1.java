/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer,List<TreeNode>> dp=new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if(dp.containsKey(n))
            return dp.get(n);

       List<TreeNode> result=new ArrayList<>();
       if(n==1){
           result.add(new TreeNode(0));
            return result;
       }
       else{
           for(int i=1;i<n;i+=2){
               List<TreeNode> leftList=allPossibleFBT(i);
               List<TreeNode> rightList=allPossibleFBT(n-i-1);
               for(TreeNode left:leftList){
                   for(TreeNode right:rightList){
                       TreeNode root=new TreeNode(0);
                       root.left=left;
                       root.right=right;
                       result.add(root);
                   }
               }
           }
       }
       dp.put(n,result);
       return result;
    }
}

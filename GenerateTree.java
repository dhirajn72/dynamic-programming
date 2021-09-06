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
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1,n);
    }
    public List<TreeNode> generateTrees(int m,int n){
        List<TreeNode> result=new ArrayList<>();
        if(m>n){
            result.add(null);
            return result;
        }
        else{
            for(int i=m;i<=n;i++){
                List<TreeNode> leftList=generateTrees(m,i-1);
                List<TreeNode> rightList=generateTrees(i+1,n);
                for(TreeNode left:leftList){
                    for(TreeNode right:rightList){
                        TreeNode root=new TreeNode(i);
                        root.left=left;
                        root.right=right;
                        result.add(root);
                    } 
                } 
            } 
        }
        return result;
    }
}

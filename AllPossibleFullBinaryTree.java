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
    List<TreeNode> result=new ArrayList<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if(n==0)
            return result;
        if(n%2==0)
            return result;
        return buildTree(n);
    }
    List<TreeNode> buildTree(int n){
        List<TreeNode> list=new ArrayList<>();
        if(n==1){
            list.add(new TreeNode(0));
            return list;
        }
        else{
            for(int i=0;i<n;i+=2){
                List<TreeNode> leftList=buildTree(i);
                List<TreeNode> rightList=buildTree(n-i-1);
                for(TreeNode left:leftList){
                    for(TreeNode right:rightList){
                        TreeNode root=new TreeNode(0);
                        root.left=left;
                        root.right=right;
                        list.add(root);
                    }
                }
            }
        }
        return list;
    }
}

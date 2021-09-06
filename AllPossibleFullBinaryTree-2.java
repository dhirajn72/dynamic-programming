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

        return allBinaryTree(n);        
    }
    List<TreeNode> allBinaryTree(int n){
        List<TreeNode> list=new ArrayList<>();
        if(n==1){
            TreeNode node=new TreeNode(0);
            list.add(node);
            return list;
        }
        else{
            for(int i=1;i<n;i+=2){
                List<TreeNode> leftTree=allBinaryTree(i);
                List<TreeNode> rightTree=allPossibleFBT(n-i-1);
                for(TreeNode left:leftTree){
                    for(TreeNode right:rightTree){
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

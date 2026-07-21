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
    static void preorder(TreeNode root, List<TreeNode> res){
        if(root==null){
            return;
        }
        res.add(root);
        preorder(root.left,res);
        preorder(root.right,res);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        preorder(root,res);
        for(int i=0;i<res.size()-1;i++){
            res.get(i).left = null;
            res.get(i).right = res.get(i+1);
        }
        //System.out.println(res);

        
    }
}
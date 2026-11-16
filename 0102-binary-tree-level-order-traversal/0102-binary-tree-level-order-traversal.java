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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root==null){
            return res;
        }
        qu.offer(root);
        while(!qu.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = qu.size();
            for(int i=0;i<size;i++){
                TreeNode temp = qu.poll();
                if(temp.left!=null){
                    qu.add(temp.left);
                }
                if(temp.right!=null){
                    qu.add(temp.right);
                }
                list.add(temp.val);
            }
            res.add(list);
        }
        return res;
        

    }
}
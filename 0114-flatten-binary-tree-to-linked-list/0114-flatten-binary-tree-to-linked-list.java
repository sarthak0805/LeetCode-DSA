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
    public void preOrder(TreeNode root, List<TreeNode> l){
        if(root==null) return;
        l.add(root);
        preOrder(root.left,l);
        preOrder(root.right,l);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        preOrder(root,ans);
        if(root == null) return;
        for(int i = 0; i < ans.size() - 1; i++){
            ans.get(i).left = null;
            ans.get(i).right = ans.get(i + 1);
        }

        ans.get(ans.size() - 1).left = null;
        ans.get(ans.size() - 1).right = null;
    }
}
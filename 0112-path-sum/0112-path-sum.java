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
    public static boolean solve(TreeNode root, int sum, int target){
        if(root == null) return false;
        int curr = root.val;
        sum+=curr;
        if(sum == target && (root.left == null && root.right == null)) return true;
        return (solve(root.left,sum,target) || solve(root.right,sum,target));
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root,0,targetSum);
    }
}
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
    public static List<Integer> dfs(TreeNode node){
        List<Integer> path = new ArrayList<>();
        preOrder(node,path);
        return path;
    }
    public static void preOrder(TreeNode node, List<Integer> path){
        if(node == null) return;
        path.add(node.val);
        preOrder(node.left,path);
        preOrder(node.right,path);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = dfs(root);
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < list.size() ;i++){
            min = Math.min(min,list.get(i) - list.get(i-1));
        }
        return min;
    }
}
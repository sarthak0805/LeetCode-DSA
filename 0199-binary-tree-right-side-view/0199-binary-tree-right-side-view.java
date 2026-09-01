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
    public static void preOrder(int curr,TreeNode root, Map<Integer,TreeNode> map){
        if(root == null) return;
        map.put(curr++,root);
        preOrder(curr,root.left,map);
        preOrder(curr--,root.right,map);
    }
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer,TreeNode> map = new HashMap<>();
        //preorder traversal height =wise from left to right
        preOrder(0,root,map);
        List<Integer> ans = new ArrayList<>();
        List<Integer> key = new ArrayList<>();
        for(int x : map.keySet()){
            key.add(x);
        }
        Collections.sort(key);
        for(int x : key){
            ans.add(map.get(x).val);
        }
        return ans;
    }
}
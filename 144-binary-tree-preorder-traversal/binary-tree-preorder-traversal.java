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
    List<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        print(root, list);
        return list;
    }

    public void print(TreeNode root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        print(root.left, list);
        print(root.right, list);
    }
}
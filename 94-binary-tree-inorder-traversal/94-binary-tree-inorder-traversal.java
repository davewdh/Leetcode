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
    public List<Integer> inorderTraversal(TreeNode root) {
        // Stack<TreeNode> stack = new Stack<>();
        // List<Integer> aList = new ArrayList<>();
        // if (root == null)
        //     return aList;
        // stack.push(root);
        // while (stack.size() > 0) {
        //     TreeNode current = stack.pop();
        //     aList.add(current.val);
        //     if (current.right != null)
        //         stack.push(current.right);
        //     if (current.left != null)
        //         stack.push(current.left);
        // }
        // return aList;
        
        List<Integer> arr = new ArrayList<>();
        if (root == null) 
            return new ArrayList<Integer>();
        arr.addAll(inorderTraversal(root.left));
        arr.add(root.val);
        arr.addAll(inorderTraversal(root.right));
        return arr;
        
        
        
        
        
        
        
        
        
        
        
    }
}
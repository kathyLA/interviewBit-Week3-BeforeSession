/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode flatten(TreeNode a) {
        if (a == null) {
            return null;
        }
        
        TreeNode left = a.left;
        TreeNode right = a.right;
        
        a.left = null;
        
        flatten(left);
        flatten(right);
        
        a.right = left;
        
        TreeNode pt = a;
        while (pt.right != null) {
            pt = pt.right;
        }
        pt.right = right;
        return a;
    }
}

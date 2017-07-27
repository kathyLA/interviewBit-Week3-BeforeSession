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
    
    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        ArrayList<Integer>res = new ArrayList <Integer> ();
        ArrayList<TreeNode> stack = new ArrayList <TreeNode> ();
        
        if(a == null) return res;
        TreeNode pt = a;
        
        while(stack.size() > 0 || pt != null) {
            if(pt != null) {
                stack.add(pt);
                pt = pt.left;
            } else {
                int n = stack.size();
                TreeNode temp = stack.get( n-1 );
                stack.remove(n-1);
                res.add(temp.val);
                pt = temp.right;
            }
            
        }
        
        return res;    
    }
}

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     *  @param T1, T2: The roots of binary tree.
     *  @return True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here 
        if(T2 == null) return true;
        if(T1 == null) return false;
        
        if(isSameTree(T1, T2)) return true;
        if(isSubtree(T1.left, T2) || isSubtree(T1.right, T2)) return true;
        return false;
    }
    
    private boolean isSameTree(TreeNode T1, TreeNode T2){
        if(T1 == null || T2 == null) return T1 == T2;
        if(T1.val != T2.val) return false;
    
        return isSameTree(T1.left, T2.left) && isSameTree(T1.right, T2.right);
    }
}
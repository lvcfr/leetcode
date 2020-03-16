import com.sun.source.tree.Tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void main(String args[]) {
        Solution s = new Solution();
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(5);
        t.left.left = new TreeNode(3);
        t.left.right = new TreeNode(4);
        t.right.right = new TreeNode(6);
        s.flatten(t);
    }
    public void flattenOld(TreeNode root) {
        if(root==null) return;
        System.out.println(root.val);
        flatten(root.left);
        flatten(root.right);
    }
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        flatten(root.right);
        if(root.left==null && root.right==null) return;
        TreeNode t = root.right;
        root.right=root.left;
        root.left=null;
        for(TreeNode k = root; k!=root.right; k=root.right) {

        }

        System.out.println(root.val);
        flatten(root.left);
        flatten(root.right);
    }
}
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
    TreeNode find(TreeNode root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val>key)
        {
            root.left = deleteNode(root.left,key);
        }
        else if(root.val<key)
        {
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.left==null && root.right==null)
            {
                return null;
            }
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;

            TreeNode is = find(root.right);
            root.val = is.val;
            root.right = deleteNode(root.right,is.val);
        }
        return root;
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public boolean isBalanced(TreeNode root) {
        int lh; /* for height of left subtree */
 
        int rh; /* for height of right subtree */
 
        /* If tree is empty then return true */
        if (root == null)
            return true;
 
        /* Get the height of left and right sub trees */
        lh = height(root.left);
        rh = height(root.right);
 
        if (Math.abs(lh - rh) <= 1 && isBalanced(root.left)
            && isBalanced(root.right))
            return true;
 
        /* If we reach here then tree is not height-balanced
         */
        return false;
    }
    int height(TreeNode root)
    {
        /* base case tree is empty */
        if (root == null)
            return 0;
 
        return 1 + Math.max(height(root.left), height(root.right));
    }
}

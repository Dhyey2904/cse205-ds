class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
 
        // get the height of left and right sub-trees
        int lheight = height(root.left);
        int rheight = height(root.right);
 
        // get the diameter of left and right sub-trees
        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);

        return Math.max(lheight + rheight  , Math.max(ldiameter, rdiameter));        
    }
    int height(TreeNode root)
    {
        /* base case tree is empty */
        if (root == null)
            return 0;
 
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
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
    public int maxDepth(TreeNode root) {
        int count = 0;
        if (root == null)
            return 0;
        else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            if (lDepth > rDepth)
                count = lDepth + 1;
            else
                count = rDepth + 1;
        }
        return count;
    }
}
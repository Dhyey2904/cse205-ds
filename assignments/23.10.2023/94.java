import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> list = new ArrayList<>(); 
    public List<Integer> inorderTraversal(TreeNode root) {
        //recursive approch
        if(root!= null){
           
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
            
        }
        return list;
    }
}

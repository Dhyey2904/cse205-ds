import java.util.*;

class S46 {
  public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; // Array to keep track of used elements
        getPermutations(new ArrayList<>(), ans, nums, used);
        return ans;
    }

    public void getPermutations(List<Integer> start, List<List<Integer>> ans, int[] nums, boolean[] used) {
        if (start.size() == nums.length) {
            ans.add(new ArrayList<>(start));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                start.add(nums[i]);
                used[i] = true;//if we are allowed to do repetition 
                getPermutations(start, ans, nums, used);
                used[i] = false;
                start.remove(start.size() - 1);
            }
        }
    }
}

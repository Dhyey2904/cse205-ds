import java.util.*;
class S39 {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        getCombinationSum(new ArrayList<>(), ans, candidates,target,0);
        return ans;
    }

    public void getCombinationSum(List<Integer> start, List<List<Integer>> ans, int[] nums,int target, int index) {
        if(target == 0) {
            ans.add(new ArrayList<>(start));
        }

        for (int i = index; i < nums.length; i++) {   
            if (nums[i] > target) {
                break; // Skip elements that are too large
            }

            start.add(nums[i]);//if we are allowed to do repetition 
            getCombinationSum(start, ans, nums, target-nums[i],i);        
            start.remove(start.size() - 1);          
        }
    }
}

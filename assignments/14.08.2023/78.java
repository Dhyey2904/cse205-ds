import java.util.ArrayList;
import java.util.List;

class S78 {
  public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        return subsets;
}

private void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
    //base case.
    if (index == nums.length) {
        subsets.add(new ArrayList<>(currentSubset));
        return;
    }

    // Include the current element in the subset.
    //this condition is for if the element wants to get included in subset and it chooses yes.
    currentSubset.add(nums[index]);
    generateSubsets(nums, index + 1, currentSubset, subsets);

    // Exclude the current element from the subset.
    //this condition is for if the element wants to get included in subset and it chooses no.
    currentSubset.remove(currentSubset.size() - 1);
    generateSubsets(nums, index + 1, currentSubset, subsets);

    }
}

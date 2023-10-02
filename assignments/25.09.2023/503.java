import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
          int currentNum = nums[i % n];

          while (!stack.isEmpty() && currentNum > nums[stack.peek()]) {
            int idx = stack.pop();
            result[idx] = currentNum;
          }

          if (i < n) {
            stack.push(i);
          }
        }

      return result;
    }
}

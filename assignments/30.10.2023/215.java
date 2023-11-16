class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length - k];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) {
            pq.add(i);
        } 
        int i = 1;
        while(i != k) {
            pq.poll();
            if(i == k){
                break;
            }
            i++;
        }
        return pq.peek();
    }
}
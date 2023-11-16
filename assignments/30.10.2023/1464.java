class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : nums){
            pq.add(n-1);
        }

        return pq.remove() * pq.remove();
    }
}
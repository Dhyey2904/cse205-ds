class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSFar = 0;
        
        for (int[] account : accounts) {
            int curr = 0;
            for (int money : account) {
                curr += money;
            }
            maxSFar = Math.max(maxSFar, curr);
        }
        return maxSFar;
    }
}

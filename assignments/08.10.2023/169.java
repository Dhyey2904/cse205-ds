class S169 {
    public int majorityElement(int[] nums) {
        int j = 0;
        int n = 0;
        
        for (int num : nums) {
            if (j == 0) {
                n = num;
            }
            
            if (num == n) {
                j++;
            } else {
                j--;
            }
        }
        
        return n;
    }  
}

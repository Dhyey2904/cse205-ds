class S485 {
  public int countOnes(int[] nums){
        int count = 0;
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                result = Math.max(count,result);
            }else {
                count = 0;
            }
        }
        return result;
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        return countOnes(nums);
    }
}

class S53 {
  //to get ans in -ve too. 
  public static int kadanes(int numbers[]) {
    int min = numbers[0];
    int max = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
        min = Math.max(numbers[i], min + numbers[i]);
        max = Math.max(max, min);
    }

    return max;
  }

  /*
  to get ans in +ve only

  public static void kadanes(int numbers[]){
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for(int i = 0; i < numbers.length; i++){
      sum = sum + numbers[i];
      if(sum<0){
        sum = 0;
      }
      max = Math.max(max, sum);
    }
    System.out.println("max ="+ max);
  }
  */ 

    public int maxSubArray(int[] nums) {
        return kadanes(nums);
        
    }
}

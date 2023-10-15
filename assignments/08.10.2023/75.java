import java.util.*;

class s75 {
  public void sortColors(int[] nums) {
    int n = nums.length, i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
    for (int j = 0; j < n; j++) {
        switch (nums[j]) {
            case 0:
                cnt0++;
                break;
            case 1:
                cnt1++;
                break;
            case 2:
                cnt2++;
                break;
        }
    }
    i = 0;
    while (cnt0 > 0) {
        nums[i++] = 0;
        cnt0--;
    }
    while (cnt1 > 0) {
        nums[i++] = 1;
        cnt1--;
    }
    while (cnt2 > 0) {
        nums[i++] = 2;
        cnt2--;
    }
    System.out.println(Arrays.toString(nums));
}

}

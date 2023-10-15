import java.util.Arrays;

class S2706 {
    public int buyChoco(int[] prices, int money) {
        // mergeSort(prices);
        Arrays.sort(prices);
        int n = prices[0] + prices[1];
        if(n<=money){
            return (money-n);

        }else {
            return money;
        }
    }
    // public static void mergeSort(int[] arr) {
    //     if (arr == null || arr.length <= 1) {
    //         return;
    //     }
        
    //     int mid = arr.length / 2;
    //     int[] left = new int[mid];
    //     int[] right = new int[arr.length - mid];

    //     for (int i = 0; i < mid; i++) {
    //         left[i] = arr[i];
    //     }
    //     for (int i = mid; i < arr.length; i++) {
    //         right[i - mid] = arr[i];
    //     }
        
    //     mergeSort(left); 
    //     mergeSort(right); 
    //     merge(arr, left, right); 
    // }

    // public static void merge(int[] arr, int[] left, int[] right) {
    //     int i = 0, j = 0, k = 0;
        
    //     while (i < left.length && j < right.length) {
    //         if (left[i] <= right[j]) {
    //             arr[k] = left[i];
    //             i++;
    //         } else {
    //             arr[k] = right[j];
    //             j++;
    //         }
    //         k++;
    //     }
        
    //     while (i < left.length) {
    //         arr[k] = left[i];
    //         i++;
    //         k++;
    //     }
        
    //     while (j < right.length) {
    //         arr[k] = right[j];
    //         j++;
    //         k++;
    //     }
    // }  
}

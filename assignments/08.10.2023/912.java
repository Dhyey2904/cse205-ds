class S912 {
    public int[] sortArray(int[] nums) {
        int end = nums.length-1;
        sort(nums, 0, end);
        return nums;
        
    }
  static void merge(int[] a, int l, int mid, int r) {
    int n1 = mid - l + 1;
    int n2 = r - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++) {
      L[i] = a[l + i];
    }

    for (int j = 0; j < n2; j++) {
      R[j] = a[mid + 1 + j];
    }

    int i = 0, j = 0;
    int k = l;

    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        a[k] = L[i];
        i++;
      } else {
        a[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      a[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      a[k] = R[j];
      j++;
      k++;
    }
  }

  static void sort(int[] a, int l, int r) {
    if (l < r) {
      int mid = l + (r - l) / 2;
      sort(a, l, mid);
      sort(a, mid + 1, r);
      merge(a, l, mid, r);
    }
//     int end = nums.length;
//     quickSort(nums, 0, end - 1);
//     return nums;
//     }
//   public void swap(int[] arr, int i, int j){
//     int temp = arr[i];
//     arr[i] = arr[j];
//     arr[j] = temp;
//   }

//   public int partition(int[] arr, int low, int high){
//     int pivot = arr[high];
//     int i = low - 1;
//     for( int j = low; j<= high - 1; j++){
//       if(arr[j] < pivot){
//         i++;
//         swap(arr, i, j);
//       }
//     }
//     swap(arr, i + 1, high);
//     return i+1;
//   }

//   public void quickSort(int[] arr, int low, int high)
//   {
//       if (low < high) {

//           // pi is partitioning index, arr[p]
//           // is now at right place
//           int pi = partition(arr, low, high);

//           // Separately sort elements before
//           // partition and after partition
//           quickSort(arr, low, pi - 1);
//           quickSort(arr, pi + 1, high);
//       }
//   }
  }
}

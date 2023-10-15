class S1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int maxElement = 0;

    for (int num : arr1) {
        maxElement = Math.max(maxElement, num);
    }

    int[] frequency = new int[maxElement + 1];
    for (int num : arr1) {
        frequency[num]++;
    }

    int[] result = new int[arr1.length];
    int index = 0;

    for (int num : arr2) {
        while (frequency[num] > 0) {
            result[index] = num;
            index++;
            frequency[num]--;
        }
    }
    for (int i = 0; i <= maxElement; i++) {
        while (frequency[i] > 0) {
            result[index] = i;
            index++;
            frequency[i]--;
        }
    }

    return result;
    }  
}

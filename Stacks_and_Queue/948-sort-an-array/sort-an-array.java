class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergesort(int[] a, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergesort(a, low, mid);
            mergesort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        
        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                temp[k++] = a[left++];
            } else {
                temp[k++] = a[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = a[left++];
        }
        while (right <= high) {
            temp[k++] = a[right++];
        }

        
        for (int i = 0; i < temp.length; i++) {
            a[low + i] = temp[i];
        }
    }
}

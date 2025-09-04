class Solution {
    public int[] sortArray(int[] nums) {
        divideArr(nums, 0, nums.length - 1);
        return nums;
    }

    public void divideArr(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            divideArr(arr, l, mid);
            divideArr(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public void merge(int[] arr, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int[] temp = new int[end - start + 1];
        int idx = 0;
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            } else {
                temp[idx++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[idx++] = arr[left++];
        }
        while (right <= end) {
            temp[idx++] = arr[right++];
        }
        // ✅ Copy temp back into arr
        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }

    }
}
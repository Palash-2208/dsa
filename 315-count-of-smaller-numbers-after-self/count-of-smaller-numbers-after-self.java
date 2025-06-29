import java.util.*;

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Integer[] result = new Integer[n];
        Integer[] indices = new Integer[n];

        // Initialize indices array to track original positions of elements
        for (int i = 0; i < n; i++) {
            indices[i] = i;
            result[i] = 0; // Initialize result array to 0
        }

        // Perform merge sort and count smaller elements
        mergeSort(nums, indices, result, 0, n - 1);

        return Arrays.asList(result);
    }

    private void mergeSort(int[] nums, Integer[] indices, Integer[] result, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, indices, result, left, mid);    // Sort the left half
        mergeSort(nums, indices, result, mid + 1, right); // Sort the right half

        merge(nums, indices, result, left, mid, right);   // Merge and count smaller elements
    }

    private void merge(int[] nums, Integer[] indices, Integer[] result, int left, int mid, int right) {
        int i = left, j = mid + 1;
        Integer[] temp = new Integer[right - left + 1];
        int k = 0;
        int smallerCount = 0;

        while (i <= mid && j <= right) {
            if (nums[indices[i]] <= nums[indices[j]]) {
                // The number at indices[i] is smaller or equal, no count increase
                temp[k++] = indices[i++];
                result[indices[i - 1]] += smallerCount;  // Update count for the left side element
            } else {
                // The number at indices[j] is smaller, increment smallerCount
                temp[k++] = indices[j++];
                smallerCount++;
            }
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            temp[k++] = indices[i++];
            result[indices[i - 1]] += smallerCount; // Update count for the left side element
        }

        // Copy remaining elements from the right half
        while (j <= right) {
            temp[k++] = indices[j++];
        }

        // Copy the merged temp array back to indices
        System.arraycopy(temp, 0, indices, left, temp.length);
    }
}

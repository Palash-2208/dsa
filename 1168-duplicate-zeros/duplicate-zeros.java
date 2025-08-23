class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int countZeros = 0;
        for (int num : arr) {
            if (num == 0)
                countZeros++;
        }
        int i = n - 1;
        int writePosition = n + countZeros - 1;
        while (i >= 0) {
            if (writePosition < n) {
                arr[writePosition] = arr[i];
            }
            if (arr[i] == 0) {
                writePosition--;
                if (writePosition < n) {
                    arr[writePosition] = 0;
                }
            }
            i--;
            writePosition--;
        }
    }
}
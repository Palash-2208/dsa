class Solution {
    public int minOperations(String s) {
          char[] arr = s.toCharArray();
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((i % 2 == 0 && arr[i] != '0') || (i % 2 == 1 && arr[i] != '1')) {
                even++;
            }
            if ((i % 2 == 0 && arr[i] != '1') || (i % 2 == 1 && arr[i] != '0')) {
                odd++;
            }
        }
        return Math.min(even, odd);
    }
}
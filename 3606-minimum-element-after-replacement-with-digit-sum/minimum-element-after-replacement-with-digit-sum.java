class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;

        for (int num : nums) {
            int sum = 0;

            do {
                sum += num % 10;
                num /= 10;
            } while (num > 0);

            ans = Math.min(ans, sum);
        }

        return ans;
    }
}
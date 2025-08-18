class Solution {
    public int rob(int[] nums) {
           int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int prev = Math.max(nums[0], nums[1]); 
        int prevPrev = nums[0];              
        int mx = prev;

        for (int i = 2; i < n; i++) {
            int steal = nums[i] + prevPrev; 
            int skip = prev;               
            mx = Math.max(steal, skip);

            prevPrev = prev;
            prev = mx;
        }
        return mx; 
    }
}
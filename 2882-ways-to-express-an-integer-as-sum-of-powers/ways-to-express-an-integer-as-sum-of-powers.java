class Solution {
   private static final int MOD = 1_000_000_007;

    public int numberOfWays(int n, int x) {
       
        java.util.List<Integer> powers = new java.util.ArrayList<>();
        for (int i = 1; ; i++) {
            long p = powLimited(i, x, n);
            if (p > n) break;
            powers.add((int) p);
        }

        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int p : powers) {
            for (int s = n; s >= p; s--) {
                dp[s] += dp[s - p];
                if (dp[s] >= MOD) dp[s] -= MOD;
            }
        }
        return (int) dp[n];
    }

    private long powLimited(long base, int exp, long limit) {
        long result = 1;
        for (int e = 0; e < exp; e++) {
            result *= base;
            if (result > limit) return limit + 1;
        }
        return result;
    }
}
class Solution {

    private int solve(int[] nums, int start, int end) {

        int len = end - start + 1;

        if (len == 1)
            return nums[start];

        int[] dp = new int[len];

        dp[0] = nums[start];
        dp[1] = nums[start + 1];

        int best = dp[0];

        for (int i = 2; i < len; i++) {
            dp[i] = nums[start + i] + best;
            best = Math.max(best, dp[i - 1]);
        }

        return Math.max(dp[len - 1], dp[len - 2]);
    }

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        return Math.max(
                solve(nums, 0, n - 2),
                solve(nums, 1, n - 1)
        );
    }
}
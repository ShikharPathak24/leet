class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        // suffix[i] = total stones from i to n-1
        int[] suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        int[][] dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, 1, piles, suffix, dp);
    }

    private int solve(int i, int M, int[] piles, int[] suffix, int[][] dp) {

        // If we can take all remaining piles
        if (i >= piles.length) {
            return 0;
        }

        if (2 * M >= piles.length - i) {
            return suffix[i];
        }

        if (dp[i][M] != -1) {
            return dp[i][M];
        }

        int best = 0;

        // Try taking X piles, where 1 <= X <= 2M
        for (int X = 1; X <= 2 * M; X++) {

            // Opponent gets the remaining stones
            int opponent = solve(
                i + X,
                Math.max(M, X),
                piles,
                suffix,
                dp
            );

            // Current player's stones
            int current = suffix[i] - opponent;

            best = Math.max(best, current);
        }

        return dp[i][M] = best;
    }
}
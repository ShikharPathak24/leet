class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX = 2048;

        boolean[] one = new boolean[MAX];
        boolean[] two = new boolean[MAX];
        boolean[] three = new boolean[MAX];

        for (int num : nums) {

            for (int x = 0; x < MAX; x++) {
                if (two[x]) {
                    three[x ^ num] = true;
                }
            }

            for (int x = 0; x < MAX; x++) {
                if (one[x]) {
                    two[x ^ num] = true;
                }
            }

            one[num] = true;
        }

        // Triplets allow repeated indices (i <= j <= k),
        // so handle repeated-element cases.
        for (int num : nums) {
            three[num] = true;
            for (int x = 0; x < MAX; x++) {
                if (one[x]) {
                    three[x] = true;
                }
            }
        }

        int ans = 0;
        for (boolean b : three) {
            if (b) ans++;
        }

        return ans;
    }
}
class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        /*
         * suffix[i] = maximum number of characters
         * from the END of word2 that can be matched
         * using word1[i...n-1].
         */
        int[] suffix = new int[n + 1];

        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {

            suffix[i] = suffix[i + 1];

            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                suffix[i]++;
                j--;
            }
        }

        int[] ans = new int[m];

        int i = 0;
        j = 0;

        boolean mismatchUsed = false;

        while (i < n && j < m) {

            // Case 1: Characters match
            if (word1.charAt(i) == word2.charAt(j)) {

                ans[j] = i;
                j++;
            }

            // Case 2: Characters don't match
            else if (!mismatchUsed) {

                /*
                 * We can use this character as our
                 * one allowed mismatch only if the
                 * remaining characters can be matched.
                 */
                int remaining = m - j - 1;

                if (suffix[i + 1] >= remaining) {

                    ans[j] = i;
                    j++;

                    mismatchUsed = true;
                }
            }

            i++;
        }

        // We couldn't construct the complete sequence
        if (j != m) {
            return new int[0];
        }

        return ans;
    }
}

class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find the largest pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2; // Current speed

            if (canFinish(piles, h, mid)) {
                high = mid - 1; // Try a smaller speed
            } else {
                low = mid + 1;  // Need a larger speed
            }
        }

        return low; // Minimum valid speed
    }

    private boolean canFinish(int[] piles, int h, int speed) {

        long hours = 0;

        for (int pile : piles) {

            // Calculate hours needed for this pile
            hours += (pile + speed - 1) / speed;

            // Early exit if already exceeding h
            if (hours > h) {
                return false;
            }
        }

        return true;
    }
}
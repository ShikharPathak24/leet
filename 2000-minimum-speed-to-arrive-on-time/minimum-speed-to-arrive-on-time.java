class Solution {

    public int minSpeedOnTime(int[] dist, double hour) {

        int low = 1;
        int high = 10000000;
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canReach(dist, hour, mid)) {
                answer = mid;
                high = mid - 1; // Try smaller speed
            } else {
                low = mid + 1;  // Need larger speed
            }
        }

        return answer;
    }

    private boolean canReach(int[] dist, double hour, int speed) {

        double time = 0;

        // First n-1 trains
        for (int i = 0; i < dist.length - 1; i++) {
            time += Math.ceil((double) dist[i] / speed);

            // Early exit optimization
            if (time > hour) {
                return false;
            }
        }

        // Last train
        time += (double) dist[dist.length - 1] / speed;

        return time <= hour;
    }
}
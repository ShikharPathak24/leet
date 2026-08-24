import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {

        int n = ratings.length;

        int[] arr = new int[n];

        // Initially give every child 1 candy
        Arrays.fill(arr, 1);

        // Left to Right
        for (int i = 0; i < n - 1; i++) {
            if (ratings[i] < ratings[i + 1]) {
                arr[i + 1] = arr[i] + 1;
            }
        }

        // Right to Left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }

        // Calculate total candies
        int total = 0;

        for (int x : arr) {
            total += x;
        }

        return total;
    }
}
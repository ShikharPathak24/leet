class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        List<Integer> al = new ArrayList<>();

        // Find min and max
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        // Check numbers between min and max
        for (int i = min + 1; i < max; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                al.add(i);
            }
        }

        return al;
    }
}
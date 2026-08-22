class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> op = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                if (nums[j] + nums[k] == -nums[i]) {

                    List<Integer> curr = new ArrayList<>();

                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);

                    op.add(curr);

                    j++;
                    k--;

                    // Skip duplicate j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                } 
                else if (nums[j] + nums[k] < -nums[i]) {
                    j++;
                } 
                else {
                    k--;
                }
            }
        }

        return op;
    }
}
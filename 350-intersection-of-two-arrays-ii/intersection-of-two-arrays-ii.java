class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Count frequency of elements in nums1
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        // Find intersection
        for (int j = 0; j < nums2.length; j++) {

            if (map.getOrDefault(nums2[j], 0) > 0) {

                list.add(nums2[j]);

                // Decrease frequency
                map.put(nums2[j], map.get(nums2[j]) - 1);
            }
        }

        // Convert ArrayList to int[]
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}

      
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList <Integer> ans = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();
        for (int j = 0; j < nums2.length; j++){
            set.add(nums2[j]);
        }
        for (int i = 0; i < nums1.length; i++){
            if (set.contains(nums1[i])){
                ans.add(nums1[i]);
                set.remove(nums1[i]);


            }


        }
        int  [] result = new int [ans.size()];
        for (int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);

        }
        return result;

       

        
    }
}
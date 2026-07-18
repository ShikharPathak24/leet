class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[n-1];
                nums[n-1] = temp;
                i--;
                n--;
           }

           
        }
        return n;
    }
}
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i= 0; i < nums.length; i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
        }
        int []arr = new int [max + 1];
        for (int i : nums){
            arr[i]++;
        }
        for (int i = min; i < max; i++){
            if(arr[i] == 0){
                al.add(i);
            }
        }
        return al;
        
    }
}
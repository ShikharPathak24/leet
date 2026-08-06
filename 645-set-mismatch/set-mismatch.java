class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int missing = -1;
        int duplicate = -1;
        for (int i = 1; i <= nums.length; i++){

            if(!map.containsKey(i)){
                missing = i;
            }
            if(map.getOrDefault(i,0) == 2){
                duplicate = i;
            }

        }
        return  new int []  {duplicate,missing};
        
    }
}
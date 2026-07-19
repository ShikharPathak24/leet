class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int n = height.length;
        int j = n-1;
        int maxwater = 0;
        while ( i < j){
            int w = j - i;
            int ht = Math.min(height[i] , height[j]);
            int area = w * ht;
            maxwater = Math.max(area,maxwater);
            if (height [i] < height [j]){
                i++;

            }else{
                j--;
            }
        }
        return maxwater;

        
    }
}
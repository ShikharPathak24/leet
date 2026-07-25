class Solution {
    public int maxProduct(int n) {
        int largest = 0;
        int slargest = 0;
        while (n > 0){
            int t = n % 10;
            if(t > largest){
                slargest = largest;
                largest = t;
                
            } else if(t >= slargest){
                 slargest = t;

            }
           n = n / 10;
        }
        return largest * slargest;
        
    }
}
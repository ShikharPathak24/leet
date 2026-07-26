class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        HashSet<Integer> sh = new HashSet();
        while(n != 1){
            while(n > 0){
                int dig = n % 10;
                n = n / 10;
                sum += Math.pow(dig,2);
            }
            if(sh.contains(sum)){
                return false;
            }
            else{
                sh.add(sum);
                n=sum;
                sum=0;
            }
        }  
        return true;
    }
}
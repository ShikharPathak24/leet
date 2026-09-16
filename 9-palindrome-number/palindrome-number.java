class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = 0;
        int copy = x;
        while (copy > 0){
            int digit = copy % 10;
            num = (num * 10) + digit;
            copy /= 10;
        }
        return (num == x);
        
    }
}
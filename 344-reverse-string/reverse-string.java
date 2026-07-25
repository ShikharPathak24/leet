class Solution {
    public void reverseString(char[] s) {
        char rev [] = new char [s.length];
        int n = s.length-1;
        for(int i =0 ; i<s.length; i++ ){
            rev[i] = s[n];
            n--;
        }
        for(int i =0 ; i<s.length; i++ ){
            s[i] = rev[i];
        }
        
    }
}
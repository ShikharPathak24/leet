class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length() - 1;
        int i = 0;
        while (n >= 0 && s.charAt(n) == ' ' ){
            n--;
        }
        while (n >= 0 && s.charAt(n) != ' '){
            n--;
            i++;
            
        }
        return i ;
        
    }
}
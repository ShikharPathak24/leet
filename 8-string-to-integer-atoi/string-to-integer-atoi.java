class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int j = s.length();
            while (i < j && s.charAt(i) == ' '){
                i++;
            }
            int sign = 1;
            if (i < j && s.charAt(i) == '-'){
                sign = -1;
                i++;
            }
            else if (i < j && s.charAt(i) =='+'){
                i++;
            }
            long n = 0;
            while (i < j && Character.isDigit(s.charAt(i))){
                int digit = s.charAt(i) - '0';
                n = n*10 + digit;

                if (sign*n > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if (sign*n < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                i++;
            }
            return (int) (sign * n);
        
    }
}
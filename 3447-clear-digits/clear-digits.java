class Solution {
    public String clearDigits(String s) {

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            // If current character is a digit
            if (Character.isDigit(ch)) {

                // Remove the closest character to its left
                stack.deleteCharAt(stack.length() - 1);

            } 
            else {

                // Store non-digit character
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}
class Solution {
    public int minLength(String s) {

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            // Check if current character forms "AB"
            // or "CD" with the last character
            if (stack.length() > 0 &&
                ((stack.charAt(stack.length() - 1) == 'A' && ch == 'B') ||
                 (stack.charAt(stack.length() - 1) == 'C' && ch == 'D'))) {

                // Remove the last character
                stack.deleteCharAt(stack.length() - 1);

            } else {

                // Add current character
                stack.append(ch);
            }
        }

        return stack.length();
    }
}
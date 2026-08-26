class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            int count = 0;

            for (int j = i; j < s.length(); j++) {

                if (s.charAt(j) == '1') {
                    count++;
                }

                // Beautiful substring
                if (count == k) {

                    String current = s.substring(i, j + 1);

                    // First valid answer
                    if (ans.equals("")) {
                        ans = current;
                    }

                    // Shorter substring
                    else if (current.length() < ans.length()) {
                        ans = current;
                    }

                    // Same length -> lexicographically smaller
                    else if (current.length() == ans.length()
                            && current.compareTo(ans) < 0) {
                        ans = current;
                    }

                    // Adding more characters will only make
                    // the substring longer.
                    break;
                }
            }
        }

        return ans;
    }
}
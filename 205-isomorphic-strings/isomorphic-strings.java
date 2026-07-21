class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr = new int[256];
        int[] brr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (arr[a] != brr[b]) {
                return false;
            }
            arr[a] = i + 1;
            brr[b] = i + 1;
        }
        return true;

    }
}
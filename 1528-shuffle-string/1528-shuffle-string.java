class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int idx = indices[i];
            ans[idx] = s.charAt(i);
        }

        // Using StringBuilder for efficient string concatenation
        StringBuilder result = new StringBuilder(s.length());
        for (char x : ans) {
            result.append(x);
        }

        return result.toString();
    }
}

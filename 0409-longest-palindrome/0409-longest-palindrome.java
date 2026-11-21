class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (char c : s.toCharArray()) {
            arr[c]++;
        }
        int count = 0;
        for (int i : arr) {
            count += (i / 2) * 2;
        }
        if (count < s.length()) {
            count++;
        }
        return count;
    }
}
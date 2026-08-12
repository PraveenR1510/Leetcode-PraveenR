// Last updated: 8/12/2026, 9:31:19 PM
class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1; boolean result = true; while (l < r) { if (s.charAt(l) != s.charAt(r)) { result = check(s, l + 1, r) || check(s, l, r - 1); break; } l++; r--; }return (result); } static boolean check(String s, int l, int r) { while (l < r) { if (s.charAt(l++) != s.charAt(r--)) return false; } return true;
    }
}
// Last updated: 8/12/2026, 9:32:21 PM
class Solution {
    public boolean isAnagram(String s, String t) {
char[] a = s.toCharArray(), b = t.toCharArray(); Arrays.sort(a); Arrays.sort(b); return(Arrays.equals(a, b));
    }
}
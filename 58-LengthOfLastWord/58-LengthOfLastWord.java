// Last updated: 8/12/2026, 9:33:36 PM
class Solution {
    public int lengthOfLastWord(String s) {
            int i = s.length() - 1;
        int length = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
// Last updated: 8/12/2026, 9:29:26 PM
class Solution {
    public int maxDistance(String moves) {
        int up = 0, down = 0, left = 0, right = 0, underscore = 0;

        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'U':
                    up++;
                    break;
                case 'D':
                    down++;
                    break;
                case 'L':
                    left++;
                    break;
                case 'R':
                    right++;
                    break;
                case '_':
                    underscore++;
                    break;
            }
        }

        return Math.abs(right - left) + Math.abs(up - down) + underscore;
    }
}
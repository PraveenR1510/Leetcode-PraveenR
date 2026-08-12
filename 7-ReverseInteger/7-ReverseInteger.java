// Last updated: 8/12/2026, 9:34:13 PM
class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            result = result * 10 + digit;
        }
        return result;
    }
    }

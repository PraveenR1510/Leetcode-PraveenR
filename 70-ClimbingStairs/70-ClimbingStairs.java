// Last updated: 8/12/2026, 9:33:29 PM
class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 2; if (n == 1) return(1); else if (n == 2) return(2); else { for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; } return (b);
    }
}
}
// Last updated: 8/12/2026, 9:30:16 PM
class Solution {
    public boolean isThree(int n) {
        int root = (int)Math.sqrt(n); boolean result = root * root == n && isPrime(root); return (result); } static boolean isPrime(int x) { if (x < 2) return false; for (int i = 2; i * i <= x; i++) { if (x % i == 0) return false; } return true;
    }
}
// Last updated: 8/12/2026, 9:32:53 PM
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0; for (int n : nums) { if (count == 0) candidate = n; count += (n == candidate) ? 1 : -1; }return (candidate);
    }
}
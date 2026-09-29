// Last updated: 9/29/2026, 10:22:50 AM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        for (int i = 0; i < nums.length - 1; i += 2) {
4            if (nums[i] != nums[i + 1]) {
5                return nums[i];
6            }
7        }
8        return nums[nums.length - 1];
9    }
10}
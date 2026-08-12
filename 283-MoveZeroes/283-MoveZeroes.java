// Last updated: 8/12/2026, 9:32:08 PM
class Solution {
    public void moveZeroes(int[] nums) {
       
       int index = 0; for (int i = 0; i < nums.length; i++) { if (nums[i] != 0) { nums[index++] = nums[i]; } } while (index < nums.length) { nums[index++] = 0; } System.out.println(Arrays.toString(nums));
    }
}
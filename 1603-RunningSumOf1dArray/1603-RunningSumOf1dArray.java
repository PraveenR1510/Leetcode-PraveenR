// Last updated: 8/12/2026, 9:30:35 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int i;
        for(i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
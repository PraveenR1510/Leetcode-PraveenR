// Last updated: 8/12/2026, 9:32:13 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
        }
        int x=sum;
        int y=n*(n+1)/2;
        int z=y-x;
         return z;
    }
}
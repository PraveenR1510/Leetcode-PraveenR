// Last updated: 8/12/2026, 9:30:19 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=nums[nums[i]];
        return arr;
    }
}
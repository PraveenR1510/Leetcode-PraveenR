// Last updated: 9/5/2026, 12:30:49 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        
4        Set<Integer> set=new HashSet<>();
5        for(int i=0;i<nums.length;i++){
6            if(set.contains(nums[i]))
7            return nums[i];
8            else
9            set.add(nums[i]);
10        }
11        return -1;
12    }
13}
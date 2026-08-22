// Last updated: 8/22/2026, 9:22:12 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        
4        if(nums.length==0)
5        return 0;
6
7        int k=1;
8
9        for(int i=1;i<nums.length;i++){
10            if(nums[i] != nums[i-1]){
11                nums[k]=nums[i];
12                k++;
13            }
14        }
15
16        return k;
17    }
18}
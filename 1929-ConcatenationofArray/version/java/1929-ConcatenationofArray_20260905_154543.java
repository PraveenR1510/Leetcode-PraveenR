// Last updated: 9/5/2026, 3:45:43 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        
4        int n=nums.length;
5        int m=n+n;
6        int ans[]=new int[m];
7
8        for(int i=0;i<n;i++){
9            ans[i]=nums[i];
10            ans[i+n]=nums[i];
11        }
12
13        return ans;
14    }
15}
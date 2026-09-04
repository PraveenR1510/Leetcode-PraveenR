// Last updated: 9/4/2026, 10:34:07 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3
4        int n=nums.length;
5        int leftMax[]=new int[n];
6        int rightMin[]=new int[n];
7
8        leftMax[0]=nums[0];
9
10        for(int i=1;i<n;i++){
11            leftMax[i]=Math.max(leftMax[i-1],nums[i]);
12        }
13
14        rightMin[n-1]=nums[n-1];
15
16        for(int i=n-2;i>=0;i--){
17            rightMin[i]=Math.min(rightMin[i+1],nums[i]);
18        }
19
20        for(int i=0;i<n;i++){
21            int instability=leftMax[i]-rightMin[i];
22
23            if(instability<=k)
24                return i;
25        }
26
27        return -1;
28    }
29}
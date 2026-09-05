// Last updated: 9/5/2026, 11:46:55 AM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        
4        int n=nums.length;
5
6        int leftMax[]=new int[n];
7        int rightMin[]=new int[n];
8
9        leftMax[0]=nums[0];
10
11        for(int i=1;i<n;i++){
12            leftMax[i]=Math.max(leftMax[i-1],nums[i]);
13        }
14
15        rightMin[n-1]=nums[n-1];
16
17        for(int i=n-2;i>=0;i--){
18            rightMin[i]=Math.min(rightMin[i+1],nums[i]);
19        }
20
21        for(int i=0;i<n;i++){
22            int stability=leftMax[i]-rightMin[i];
23
24            if(stability<=k)
25            return i;
26        }
27        return -1;
28    }
29}
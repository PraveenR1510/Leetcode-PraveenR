// Last updated: 10/4/2026, 8:47:01 AM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3
4        int[] temp=nums;
5        int n=nums.length;
6
7        long even0=nums[0];
8        long odd0=Long.MIN_VALUE/2;
9        long even1=Long.MIN_VALUE/2;
10        long odd1=Long.MIN_VALUE/2;
11
12        long maxres=nums[0];
13
14        for(int i=1;i<n;i++){
15            long val=nums[i];
16
17        long neweven0=Math.max(val,odd0+val);
18        long newodd0=even0-val;
19
20        long neweven1=Math.max(odd1+val,even0);
21        long newodd1=Math.max(even1-val,odd0);
22
23        even0=neweven0;
24        odd0=newodd0;
25        even1=neweven1;
26        odd1=newodd1;
27
28        maxres=Math.max(maxres,Math.max(Math.max(even0,odd0),Math.max(even1,odd1)));
29
30        }
31
32        return maxres;
33    }
34}
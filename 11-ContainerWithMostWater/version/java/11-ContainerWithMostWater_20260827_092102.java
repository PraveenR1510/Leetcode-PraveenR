// Last updated: 8/27/2026, 9:21:02 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int left =0;
4        int right=height.length-1;
5        int maxArea=0;
6
7        while(left<right){
8            int cw=right-left;
9            int ch=Math.min(height[left],height[right]);
10            int ca=cw*ch;
11
12            maxArea=Math.max(maxArea,ca);
13
14            if(height[left]<height[right])
15            left++;
16            else
17            right--;
18
19        }
20
21        return maxArea;
22    }
23}
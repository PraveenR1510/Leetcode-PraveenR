// Last updated: 9/5/2026, 3:33:04 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        
4
5        // int nums3[]=new int[n+m];
6        // for(int i=0;i<n;i++)
7        //     nums3[i]=nums2[i];
8
9        // for(int i=0;i<m;i++){
10        //     if(nums1[i]==0)
11        //     continue;
12        //     else
13        //     nums3[nums2.length+i]=nums1[i];
14        // }
15
16        // Arrays.sort(nums3);
17
18        // System.out.print(nums3);
19
20        for(int i=0;i<n;i++){
21            nums1[m+i]=nums2[i];
22        }
23
24        Arrays.sort(nums1);
25
26    }
27}
// Last updated: 9/5/2026, 12:42:55 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        
4        int n=nums1.length;
5        int m=nums2.length;
6        Set<Integer> set=new HashSet<>();
7
8        for(int i=0;i<n;i++){
9            set.add(nums1[i]);
10        }
11
12        Set<Integer> set1=new HashSet<>();
13
14        for(int i=0;i<m;i++){
15            if(set.contains(nums2[i]))
16            set1.add(nums2[i]);
17        }
18
19        int res[]=new int[set1.size()];
20        int index=0;
21        for(int num:set1){
22            res[index++]=num;
23        }
24        return res;
25    }
26}
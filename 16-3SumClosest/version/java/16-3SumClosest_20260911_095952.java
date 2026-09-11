// Last updated: 9/11/2026, 9:59:52 AM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4        int i = n - 2;
5
6        while (i >= 0 && nums[i] >= nums[i + 1]) {
7            i--;
8        }
9
10        if (i >= 0) {
11            int j = n - 1;
12            while (nums[j] <= nums[i]) {
13                j--;
14            }
15            int temp = nums[i];
16            nums[i] = nums[j];
17            nums[j] = temp;
18        }
19
20        int start = i + 1;
21        int end = n - 1;
22        while (start < end) {
23            int temp = nums[start];
24            nums[start] = nums[end];
25            nums[end] = temp;
26            start++;
27            end--;
28        }
29    }
30}
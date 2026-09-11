// Last updated: 9/11/2026, 9:55:23 AM
1
2import java.util.ArrayList;
3import java.util.Arrays;
4import java.util.List;
5
6class Solution {
7    public List<List<Integer>> threeSum(int[] nums) {
8        Arrays.sort(nums);
9        List<List<Integer>> res = new ArrayList<>();
10
11        for (int i = 0; i < nums.length - 2; i++) {
12            if (i > 0 && nums[i] == nums[i - 1]) {
13                continue;
14            }
15
16            int left = i + 1;
17            int right = nums.length - 1;
18
19            while (left < right) {
20                int total = nums[i] + nums[left] + nums[right];
21
22                if (total < 0) {
23                    left++;
24                } else if (total > 0) {
25                    right--;
26                } else {
27                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
28
29                    while (left < right && nums[left] == nums[left + 1]) {
30                        left++;
31                    }
32                    while (left < right && nums[right] == nums[right - 1]) {
33                        right--;
34                    }
35
36                    left++;
37                    right--;
38                }
39            }
40        }
41
42        return res;
43    }
44}
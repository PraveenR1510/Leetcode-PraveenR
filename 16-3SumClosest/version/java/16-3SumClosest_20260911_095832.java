// Last updated: 9/11/2026, 9:58:32 AM
1import java.util.ArrayList;
2import java.util.Arrays;
3import java.util.List;
4
5class Solution {
6    public List<List<Integer>> fourSum(int[] nums, int target) {
7        Arrays.sort(nums);
8        List<List<Integer>> res = new ArrayList<>();
9
10        for (int i = 0; i < nums.length - 3; i++) {
11            if (i > 0 && nums[i] == nums[i - 1]) continue;
12
13            for (int j = i + 1; j < nums.length - 2; j++) {
14                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
15
16                int left = j + 1;
17                int right = nums.length - 1;
18
19                while (left < right) {
20                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
21
22                    if (sum == target) {
23                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
24                        
25                        while (left < right && nums[left] == nums[left + 1]) left++;
26                        while (left < right && nums[right] == nums[right - 1]) right--;
27
28                        left++;
29                        right--;
30                    } else if (sum < target) {
31                        left++;
32                    } else {
33                        right--;
34                    }
35                }
36            }
37        }
38
39        return res;
40    }
41}
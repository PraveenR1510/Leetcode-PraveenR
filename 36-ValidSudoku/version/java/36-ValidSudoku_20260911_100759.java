// Last updated: 9/11/2026, 10:07:59 AM
1import java.util.ArrayList;
2import java.util.Arrays;
3import java.util.List;
4
5class Solution {
6    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
7        Arrays.sort(candidates);
8        List<List<Integer>> res = new ArrayList<>();
9        List<Integer> current = new ArrayList<>();
10        
11        int n = candidates.length;
12        int[] indexStack = new int[n + 1];
13        int top = 0;
14        
15        int currentIndex = 0;
16        int currentSum = 0;
17
18        while (true) {
19            while (currentIndex < n && currentSum + candidates[currentIndex] <= target) {
20                if (currentIndex > (top > 0 ? indexStack[top - 1] + 1 : 0) && candidates[currentIndex] == candidates[currentIndex - 1]) {
21                    currentIndex++;
22                    continue;
23                }
24
25                currentSum += candidates[currentIndex];
26                current.add(candidates[currentIndex]);
27                indexStack[top++] = currentIndex;
28
29                if (currentSum == target) {
30                    res.add(new ArrayList<>(current));
31                    break;
32                }
33
34                currentIndex++;
35            }
36
37            if (top == 0) {
38                break;
39            }
40
41            int lastIndex = indexStack[--top];
42            currentSum -= candidates[lastIndex];
43            current.remove(current.size() - 1);
44
45            currentIndex = lastIndex + 1;
46        }
47
48        return res;
49    }
50}
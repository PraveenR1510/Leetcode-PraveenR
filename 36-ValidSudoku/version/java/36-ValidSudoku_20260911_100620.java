// Last updated: 9/11/2026, 10:06:20 AM
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> combinationSum(int[] candidates, int target) {
6        List<List<Integer>> res = new ArrayList<>();
7        backtrack(candidates, target, 0, new ArrayList<>(), res);
8        return res;
9    }
10
11    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> res) {
12        if (target == 0) {
13            res.add(new ArrayList<>(current));
14            return;
15        }
16
17        for (int i = start; i < candidates.length; i++) {
18            if (candidates[i] <= target) {
19                current.add(candidates[i]);
20                backtrack(candidates, target - candidates[i], i, current, res);
21                current.remove(current.size() - 1);
22            }
23        }
24    }
25}
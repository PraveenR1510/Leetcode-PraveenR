// Last updated: 9/11/2026, 10:13:48 AM
1import java.util.ArrayList;
2import java.util.Arrays;
3import java.util.HashMap;
4import java.util.List;
5import java.util.Map;
6
7class Solution {
8    public List<List<String>> groupAnagrams(String[] strs) {
9        Map<String, List<String>> map = new HashMap<>();
10
11        for (String s : strs) {
12            char[] chars = s.toCharArray();
13            Arrays.sort(chars);
14            String sortedStr = String.valueOf(chars);
15
16            if (!map.containsKey(sortedStr)) {
17                map.put(sortedStr, new ArrayList<>());
18            }
19            map.get(sortedStr).add(s);
20        }
21
22        return new ArrayList<>(map.values());
23    }
24}
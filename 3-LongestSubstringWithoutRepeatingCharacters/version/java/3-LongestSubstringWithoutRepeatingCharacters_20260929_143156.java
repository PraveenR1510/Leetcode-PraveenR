// Last updated: 9/29/2026, 2:31:56 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int longest = 0;
4        int l=0;
5        Map<Character,Integer> map=new HashMap<>();
6        for(int r=0;r<s.length();r++){
7            char ch = s.charAt(r);
8            if(!map.isEmpty() && map.containsKey(ch)){
9                l=Math.max(l,map.get(ch)+1);
10            }
11            map.put(ch,r);
12            longest=Math.max(longest,r-l+1);
13        }
14        return longest;
15    }
16}
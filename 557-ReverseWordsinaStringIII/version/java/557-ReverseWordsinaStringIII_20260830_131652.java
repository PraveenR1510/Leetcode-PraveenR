// Last updated: 8/30/2026, 1:16:52 PM
1class Solution {
2    public String reverseWords(String s) {
3        
4        String[] s1=s.split(" ");
5        StringBuilder result=new StringBuilder();
6
7        for(int i=0;i<s1.length;i++){
8            result.append(new StringBuilder(s1[i]).reverse());
9
10            if(i<s1.length-1)
11            result.append(" ");
12        }
13
14        return result.toString();
15    }
16}
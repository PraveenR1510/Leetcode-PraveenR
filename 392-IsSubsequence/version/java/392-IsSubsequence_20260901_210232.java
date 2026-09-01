// Last updated: 9/1/2026, 9:02:32 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        
4        int i=0;
5        int j=0;
6
7        while(i<s.length()&&j<t.length()){
8            if(s.charAt(i)==t.charAt(j))
9            i++;
10
11            j++;
12        }
13        if(i==s.length())
14        return true;
15        else
16        return false;
17    }
18}
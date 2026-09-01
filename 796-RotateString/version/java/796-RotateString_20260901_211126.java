// Last updated: 9/1/2026, 9:11:26 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        
4        if(s.length()==goal.length() && (s+s).contains(goal))
5        return true;
6        else
7        return false;
8    }
9}
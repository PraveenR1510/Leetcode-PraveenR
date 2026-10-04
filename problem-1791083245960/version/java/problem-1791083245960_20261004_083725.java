// Last updated: 10/4/2026, 8:37:25 AM
1class Solution {
2    public int minRotations(String s) {
3
4        int totalRot=0;
5        int currDig=0;
6
7        for(char ch:s.toCharArray()){
8
9            int nextDig=ch-'0';
10
11            int diff=Math.abs(nextDig-currDig);
12
13            totalRot = totalRot + Math.min(diff,10-diff);
14
15            currDig=nextDig;
16
17        }
18
19        return totalRot;
20    }
21}
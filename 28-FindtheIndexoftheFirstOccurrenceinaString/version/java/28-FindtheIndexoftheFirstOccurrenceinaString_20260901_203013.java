// Last updated: 9/1/2026, 8:30:13 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3
4        int hlen=haystack.length();
5        int nlen=needle.length();
6
7        if(nlen>hlen)
8        return -1;
9
10        for(int i=0;i<=hlen-nlen;i++){
11            if(haystack.substring(i,i+nlen).equals(needle))
12            return i;
13        }
14
15        return -1;
16    }
17}
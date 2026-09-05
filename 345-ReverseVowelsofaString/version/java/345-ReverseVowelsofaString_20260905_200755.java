// Last updated: 9/5/2026, 8:07:55 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        
4        if(strs==null || strs.length==0)
5        return "";
6
7        String prefix=strs[0];
8
9        for(int i=1;i<strs.length;i++){
10
11            while(strs[i].indexOf(prefix)!=0){
12                prefix=prefix.substring(0,prefix.length()-1);
13
14                if(prefix.isEmpty())
15                    return "";
16            }
17        }
18        return prefix;
19    }
20}
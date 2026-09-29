// Last updated: 9/29/2026, 10:06:40 AM
1class Solution {
2    public boolean checkRecord(String s) {
3        
4        int ac=0;
5        int lc=0;
6
7        for(char ch:s.toCharArray()){
8            if(ch=='A'){
9                ac++;
10                if(ac>=2){
11                    return false;
12                }
13                lc=0;
14            }
15            else if(ch=='L'){
16                lc++;
17                if(lc>=3){
18                    return false;
19                }
20            }
21            else{
22                lc=0;
23            }
24        }
25
26        return true;
27        
28    }
29}
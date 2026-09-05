// Last updated: 9/5/2026, 10:56:07 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        
4        String[] words=s.split(" ");
5
6        if(pattern.length()!=words.length)
7        return false;
8
9        Map<Object,Integer> map=new HashMap<>();
10
11        for(Integer i=0;i<pattern.length();i++){
12            char c=pattern.charAt(i);
13            String word=words[i];
14
15            if(map.put(c,i)!=map.put(word,i))
16            return false;
17        }
18        return true;
19    }
20}
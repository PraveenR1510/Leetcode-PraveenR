// Last updated: 9/5/2026, 7:57:32 PM
1class Solution {
2    public String reverseVowels(String s) {
3        
4        char[] ch=s.toCharArray();
5        int left=0;
6        int right=ch.length-1;
7
8        while(left<right){
9
10            while(left<right && !isVowel(ch[left]))
11            left++;
12
13            while(left<right && !isVowel(ch[right]))
14            right--;
15
16            if(left<right){
17                char temp=ch[left];
18                ch[left]=ch[right];
19                ch[right]=temp;
20                left++;
21                right--;
22            }
23        }
24        return new String(ch);
25    }
26
27    private boolean isVowel(char c){
28        return "aeiouAEIOU".indexOf(c) != -1;
29    }
30
31}
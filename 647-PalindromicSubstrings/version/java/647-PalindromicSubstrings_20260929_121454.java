// Last updated: 9/29/2026, 12:14:54 PM
1class Solution {
2    public boolean isPalindrome(String s1){
3
4        String s2=new StringBuilder(s1).reverse().toString();
5        if(s2.equals(s1)){
6            return true;
7        }
8        return false;
9    }
10    public int countSubstrings(String s) {
11    
12        int c=0;
13        for(int i=0;i<s.length();i++){
14            String s3="";
15            for(int j=i;j<s.length();j++){
16                s3+=s.charAt(j);
17                if(isPalindrome(s3)){
18                    c++;
19                }
20            }
21        }
22        return c;
23    }
24}
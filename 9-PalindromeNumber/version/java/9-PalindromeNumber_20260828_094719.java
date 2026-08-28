// Last updated: 8/28/2026, 9:47:19 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0)
4        return false;
5        int temp=x;
6        int d,ans=0;
7        while(x!=0){
8        d=x%10;
9        ans=ans*10+d;
10        x=x/10;
11        }
12        if(ans==temp)
13        return true;
14        else
15        return false;
16    }
17}
// Last updated: 8/12/2026, 9:34:11 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int temp=x;
        int d,ans=0;
        while(x!=0){
        d=x%10;
        ans=ans*10+d;
        x=x/10;
        }
        if(ans==temp)
        return true;
        else
        return false;
    }
}
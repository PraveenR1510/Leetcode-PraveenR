// Last updated: 8/12/2026, 9:32:42 PM
class Solution {
    public boolean isHappy(int n) {
        int d,ans;
        while(n!=1&&n!=4){
            ans=0;
        while(n!=0){
        d=n%10;
        ans=ans+(d*d);
        n=n/10;
        }
        n=ans;
        }
        if(n==1)
        return true;
        else
        return false;
    }
}
// Last updated: 8/12/2026, 9:30:13 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num,d,ans=0,rev=0;
        if(num==0)
            return true;
        while(num!=0){
            d=num%10;
            ans=ans*10+d;
            num=num/10;
        }
        while(ans!=0){
            d=ans%10;
            rev=rev*10+d;
            ans=ans/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
           }   
}
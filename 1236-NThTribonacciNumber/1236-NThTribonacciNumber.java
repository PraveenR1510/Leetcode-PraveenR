// Last updated: 8/12/2026, 9:30:46 PM
class Solution {
    public int tribonacci(int n) {
        int n1=0,n2=1,n3=1,n4=0;
        if(n==0||n==1)
        return n;
        if(n==2)
        return 1;
        for(int i=3;i<=n;i++){
            n4=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
        }
        return n4;
    }
}
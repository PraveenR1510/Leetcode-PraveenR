// Last updated: 8/12/2026, 9:30:41 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            product*=d;
            n=n/10;
        }
        return product-sum;
    }
}
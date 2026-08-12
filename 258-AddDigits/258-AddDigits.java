// Last updated: 8/12/2026, 9:32:17 PM
class Solution {
    public int addDigits(int num) {
         while(num>9){
            int sum=0;
        while(num!=0){
            int d=num%10;
            sum=sum+d;
            num=num/10;
        }
        num=sum;
         }
         return num;
    }
}
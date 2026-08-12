// Last updated: 8/12/2026, 9:30:38 PM
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num:nums){
            int d=0;
            while(num>0){
                d++;
                num=num/10;
            }
            if(d%2==0)
            c++;
            
        }
        return c;
    }
}
// Last updated: 8/12/2026, 9:31:29 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mc=0;
        int cc=0;
        for(int num:nums){
            if(num==1){
                cc++;
                if(cc>mc){
                    mc=cc;
                }
            }
            else
            cc=0;
        }
        return mc;
    }
}
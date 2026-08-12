// Last updated: 8/12/2026, 9:33:40 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int ms=nums[0];
        int cs=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cs<0)
            cs=nums[i];
            else
            cs+=nums[i];

        if(cs>ms)
        ms=cs;
        
    }
    return ms;
}
}
// Last updated: 8/12/2026, 9:33:09 PM
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        ans=ans^nums[i];
        return ans;
    }
}
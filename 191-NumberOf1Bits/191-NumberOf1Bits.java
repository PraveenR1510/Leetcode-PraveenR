// Last updated: 8/12/2026, 9:32:44 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    } 
    }

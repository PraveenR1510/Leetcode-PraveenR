// Last updated: 8/12/2026, 9:29:49 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int takeOnes = Math.min(numOnes, k);
        int sum = takeOnes;
        k -= takeOnes;
        if (k > 0) {
            int takeZeros = Math.min(numZeros, k);
            k -= takeZeros;
        }
        if (k > 0) {
            sum -= k;
        }
        return sum;
    }
}

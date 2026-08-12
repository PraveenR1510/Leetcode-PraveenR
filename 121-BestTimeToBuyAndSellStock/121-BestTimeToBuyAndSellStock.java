// Last updated: 8/12/2026, 9:33:12 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], profit = 0; for (int p : prices) { if (p < min) min = p; else if (p - min > profit) profit = p - min; }return (profit);
    }
}
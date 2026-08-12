// Last updated: 8/12/2026, 9:30:33 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles, empty = numBottles; while (empty >= numExchange) { int newBottles = empty / numExchange; total += newBottles; empty = empty % numExchange + newBottles; } return (total);
    }
}
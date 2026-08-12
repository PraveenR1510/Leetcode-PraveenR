// Last updated: 8/12/2026, 9:29:47 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return((arrivalTime+delayedTime)%24);
    }
}
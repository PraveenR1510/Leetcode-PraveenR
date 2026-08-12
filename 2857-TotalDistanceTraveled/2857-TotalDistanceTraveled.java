// Last updated: 8/12/2026, 9:29:41 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank > 0) {
            mainTank--;
            distance += 10;
            if (distance % 50 == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        return distance;
    }
}
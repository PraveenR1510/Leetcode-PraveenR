// Last updated: 8/12/2026, 9:29:57 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = n - 1; int rounds = time / cycle; int remain = time % cycle; int result = (rounds % 2 == 0) ? 1 + remain : n - remain; return (result);
    }
}
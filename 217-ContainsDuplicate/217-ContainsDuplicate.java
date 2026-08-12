// Last updated: 8/12/2026, 9:32:28 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); boolean result = false; for (int n : nums) { if (set.contains(n)) { result = true; break; } set.add(n); } return (result);
    }
}
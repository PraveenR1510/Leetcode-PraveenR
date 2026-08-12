// Last updated: 8/12/2026, 9:34:17 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        while (left <= right) {

            int partitionX = left + (right - left) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxLeftX =
                    (partitionX == 0)
                    ? Integer.MIN_VALUE
                    : nums1[partitionX - 1];

            int minRightX =
                    (partitionX == m)
                    ? Integer.MAX_VALUE
                    : nums1[partitionX];

            int maxLeftY =
                    (partitionY == 0)
                    ? Integer.MIN_VALUE
                    : nums2[partitionY - 1];

            int minRightY =
                    (partitionY == n)
                    ? Integer.MAX_VALUE
                    : nums2[partitionY];

            if (maxLeftX <= minRightY &&
                maxLeftY <= minRightX) {

                // Odd length
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeftX, maxLeftY);
                }

                // Even length
                return (
                    Math.max(maxLeftX, maxLeftY)
                    + Math.min(minRightX, minRightY)
                ) / 2.0;
            }

            else if (maxLeftX > minRightY) {
                right = partitionX - 1;
            }

            else {
                left = partitionX + 1;
            }
        }

        throw new IllegalArgumentException();
    }
}
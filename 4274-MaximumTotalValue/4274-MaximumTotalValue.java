// Last updated: 8/12/2026, 9:29:27 PM
import java.util.*;

class Solution {
    static final long MOD = 1_000_000_007L;

    public int maxTotalValue(int[] value, int[] decay, int m) {

        long[][] zireluntha = new long[value.length][2];
        for (int i = 0; i < value.length; i++) {
            zireluntha[i][0] = value[i];
            zireluntha[i][1] = decay[i];
        }

        long low = 1, high = 1_000_000_000L;

        while (low <= high) {
            long mid = (low + high) >>> 1;

            long cnt = count(value, decay, mid);

            if (cnt >= m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long threshold = high;

        long totalCount = 0;
        long totalSum = 0;

        for (int i = 0; i < value.length; i++) {

            long a = value[i];
            long d = decay[i];

            long k;

            if (a < threshold) {
                k = 0;
            } else {
                k = (a - threshold) / d + 1;
            }

            totalCount += k;

            if (k > 0) {
                long last = a - (k - 1) * d;
                totalSum += k * (a + last) / 2;
            }
        }

        totalSum -= (totalCount - m) * threshold;

        totalSum %= MOD;
        if (totalSum < 0) totalSum += MOD;

        return (int) totalSum;
    }

    private long count(int[] value, int[] decay, long threshold) {
        long cnt = 0;

        for (int i = 0; i < value.length; i++) {

            long a = value[i];
            long d = decay[i];

            if (a >= threshold) {
                cnt += (a - threshold) / d + 1;
            }
        }

        return cnt;
    }
}
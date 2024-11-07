import java.util.*;

public class Solution {
    public int largestCombination(int[] candidates) {
        int maxCount = 0;

        // Loop through each bit position (0 to 31 for int type in Java)
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            // Count numbers with the `bit` position set
            for (int num : candidates) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }

            // Update maxCount if this position has more numbers with the bit set
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}

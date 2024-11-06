import java.util.*;

public class findarray {
    public boolean canSortArray(int[] nums) {
        int lastGroupMax = Integer.MIN_VALUE;
        int max = nums[0];
        int lastBit = Integer.bitCount(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int bit = Integer.bitCount(nums[i]);
            if (bit == lastBit) {
                max = Math.max(max, nums[i]);
            } else {
                lastGroupMax = max;
                max = nums[i];
                lastBit = bit;
            }
            if (nums[i] < lastGroupMax) {
                return false;
            }
        }
        return true;
    }
}

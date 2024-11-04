import java.util.*;

class containsDDuplicates {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start j from i + 1
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates found
    }
}

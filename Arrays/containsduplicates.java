import java.util.HashSet;

class containsduplicates {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(nums)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
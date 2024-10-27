import java.util.*;

public class Intersectionnofarrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Create a HashSet to store unique elements of nums1
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        // Create a List to store the intersection
        List<Integer> intersection = new ArrayList<>();

        // Check for elements in nums2 that are present in the set
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
                set.remove(num); // Remove to ensure uniqueness
            }
        }

        // Convert the List to an int array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };

        int[] result = intersection(nums1, nums2);
        System.out.println("Intersection of the two arrays: " + Arrays.toString(result));
    }
}

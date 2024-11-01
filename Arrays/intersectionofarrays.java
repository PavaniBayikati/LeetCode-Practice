import java.util.*;

public class intersectionofarrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Create a List to store the intersection results
        List<Integer> intersection = new ArrayList<>();
        // Iterate through each element in the first array
        for (int i = 0; i < nums1.length; i++) {
            // Check if the current element is in the intersection list
            if (!intersection.contains(nums1[i])) {
                // Iterate through the second array
                for (int j = 0; j < nums2.length; j++) {
                    // If a match is found, add it to the intersection list
                    if (nums1[i] == nums2[j]) {
                        intersection.add(nums1[i]);
                        break; // Stop searching once we find the first match
                    }
                }
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

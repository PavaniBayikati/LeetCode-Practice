class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1; // Initialize a pointer for the position of unique elements
        for (int i = 1; i < nums.length; i++) { // Start from the second element
            if (nums[i] != nums[i - 1]) { // Check if the current element is different from the previous one
                nums[j] = nums[i]; // Store the unique element at index j
                j++; // Move to the next position for unique elements
            }
        }
        return j; // Return the count of unique elements
    }
}

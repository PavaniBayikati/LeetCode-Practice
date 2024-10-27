import java.util.*;

public class sorting_numbers {
    public static int[] sortarray(int[] nums) {
        int temp;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:-");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the Array:-");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        sortarray(nums);

        System.out.println("Array after sorting is:-");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}

import java.util.Scanner;

public class ArrayReversal {
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversedArr = new int[n];

        // Copy elements from original array to reversed array in reverse order
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }

        return reversedArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array size from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse the array
        int[] reversedArr = reverseArray(arr);

        System.out.println("\nReversed Array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

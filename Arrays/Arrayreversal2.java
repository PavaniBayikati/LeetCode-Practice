import java.util.Scanner;

public class Arrayreversal2 {
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        // Copy elements from original array to reversed array in reverse order
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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
        reverseArray(arr);

        System.out.println("\nReversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}


//kth largest element using brute force
import java.util.*;

public class Program1 {
    public static int findkthlargestelement(int arr[], int k) {
        Arrays.sort(arr);

        // Return the Kth largest element (index is size - k)
        return arr[arr.length - k];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
        int result = findkthlargestelement(arr, k);
        System.out.println(result);

    }
}
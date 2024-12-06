import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("The sorted array after selection sort is:-");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
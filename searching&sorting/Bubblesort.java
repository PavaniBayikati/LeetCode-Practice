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
        for( int i=n-1;i>=0;i--)
        {
            for( int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
            
        System.out.println("The sorted array after selection sort is:-");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

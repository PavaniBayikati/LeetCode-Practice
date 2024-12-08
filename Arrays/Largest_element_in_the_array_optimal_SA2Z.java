import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the no of elements:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the n elements:-");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("The largest element in the array is:-" + largest);
    }
}

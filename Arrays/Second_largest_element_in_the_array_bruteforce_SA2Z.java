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
        Arrays.sort(arr);
        int largest=arr[n-1];
        int Secondlargest=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                Secondlargest=arr[i];
                break;
            }
        }
        System.out.println("The Second largest element in the array is:-" + Secondlargest);
    }
}

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:-");
        int n=sc.nextInt();
        System.out.print("The divisors of the number are:-");
        for( int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}

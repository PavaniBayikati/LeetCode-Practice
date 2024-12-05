import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:-");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count=count+1;
            }
        }
        if(count==2)
        {
            System.out.println("The number is a prime number");
        }
        else
        {
            System.out.println("The number is not a prime number");
        }
    }
}

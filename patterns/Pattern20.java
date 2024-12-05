import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:-");
        int n = sc.nextInt();
        int inis=0;
        for(int i=0;i<n;i++)
        {
            
            //stars
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for( int j=0;j<=inis;j++)
            {
                System.out.print(" ");
            }
            
            //stars
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            inis=inis+ 2;
            System.out.println();
            
        }
        inis=2*n-2;
        for(int i=0;i<n;i++)
        {
            
            //stars
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for( int j=0;j<=inis;j++)
            {
                System.out.print(" ");
            }
            
            //stars
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            inis=inis-2;
            System.out.println();
            
        }
        
    }
}

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n value:-");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(char ch='A';ch<='A'+(n-i-1);ch++)
            {
                System.out.print(ch);
            }
            System.out.println(); 
        }
         
    }
}

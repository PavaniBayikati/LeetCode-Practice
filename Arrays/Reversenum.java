import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:-");
        int n=sc.nextInt();
        int reversenum =0;
        while(n>0)
        {
            int lastdigit=n%10;
            reversenum=(reversenum*10)+lastdigit;
            n=n/10;
        }
        System.out.println("Reversed Number:-"  + reversenum);
        
        
    }
}

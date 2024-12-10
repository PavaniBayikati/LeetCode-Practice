import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n value:-");
        int n=sc.nextInt();
        int original=n;
        int armstrong =0;
        int count=0;
        int temp=n;
        while(temp>0)
        {
            int lastdigit=temp%10;
            count = count+1;
            temp=temp/10;
        }
        while(n>0)
        {
            int lastdigit=n%10;
            armstrong=armstrong+(int)Math.pow(lastdigit,count);
            n=n/10;
        }
        if(original==armstrong)
        {
            System.out.println("The number is a armstrong number");
        }
        else
        {
            System.out.println("The number is not an Armstrong number");
        }
    }
}

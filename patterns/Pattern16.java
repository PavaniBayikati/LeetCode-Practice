import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:-");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i); // Cast the result to char
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close(); // Close Scanner to prevent resource leaks
    }
}

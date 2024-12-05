import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:-");
        int n = sc.nextInt();
        int spaces = 2 * n - 2; // Initial spaces
        
        for (int i = 0; i < 2 * n - 1; i++) { // Outer loop for rows
            int stars = i < n ? i : 2 * n - 2 - i; // Determine the number of stars for each row
            
            // Print stars on the left
            for (int j = 0; j <= stars; j++) {
                System.out.print('*');
            }
            
            // Print spaces in the middle
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Print stars on the right
            for (int j = 0; j <= stars; j++) {
                System.out.print('*');
            }
            
            System.out.println(); // Move to the next row
            
            // Adjust spaces for the next row
            if (i < n-1) {
                spaces -= 2; // Decrease spaces for the upper half
            } else {
                spaces += 2; // Increase spaces for the lower half
            }
        }
    }
}

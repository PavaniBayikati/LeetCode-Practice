import java.util.Arrays;
import java.util.Scanner;

public class Averagesalary {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double total = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            total += salary[i];
        }
        return total / (salary.length - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and salary values
        System.out.print("Enter the number of salaries : ");
        int n = scanner.nextInt();

        int[] salary = new int[n];
        System.out.println("Enter the salaries:");
        for (int i = 0; i < n; i++) {
            salary[i] = scanner.nextInt();
        }

        // Calculate and print the result
        Averagesalary solution = new Averagesalary();
        System.out.println("Average salary excluding min and max: " + solution.average(salary));

        scanner.close();
    }
}

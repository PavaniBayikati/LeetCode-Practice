class Calculator { // Changed 'calculator' to 'Calculator'

    public int add(int m, int n) {
        return m + n;
    }

    public int add(int m, int n, int r) {
        return m + n + r;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Changed 'calculator' to 'Calculator'
        int sum1 = calc.add(4, 5);
        System.out.println("Sum of two numbers: " + sum1);
        int sum2 = calc.add(8, 3, 2);
        System.out.println("Sum of three numbers: " + sum2);
    }
}

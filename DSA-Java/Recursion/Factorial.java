public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1; // Base case
        return n * factorial(n - 1);    // Recursive step
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}

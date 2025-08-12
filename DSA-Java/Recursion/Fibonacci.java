public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

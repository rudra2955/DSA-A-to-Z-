public class PrintNumbers {
    public static void print1ToN(int n) {
        if (n == 0) return;
        print1ToN(n - 1); // First print smaller numbers
        System.out.print(n + " ");
    }

    public static void printNTo1(int n) {
        if (n == 0) return;
        System.out.print(n + " "); // First print current number
        printNTo1(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("1 to N: ");
        print1ToN(n);
        System.out.println();
        System.out.print("N to 1: ");
        printNTo1(n);
    }
}

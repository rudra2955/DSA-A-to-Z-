public class PalindromeCheck {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true; // Base case
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(str + " is palindrome? " + isPalindrome(str, 0, str.length() - 1));
    }
}

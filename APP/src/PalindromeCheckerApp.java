public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String str = "racecar"; // Example input

        // Check palindrome using recursion
        if (isPalindromeRecursive(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome!");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Recursive function to check palindrome
    private static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base case: crossed over or single char left
        if (start >= end) return true;

        // Compare characters at start and end
        if (str.charAt(start) != str.charAt(end)) return false;

        // Recur for inner substring
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}
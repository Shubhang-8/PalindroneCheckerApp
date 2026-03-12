public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Race Car";

        // Normalize string
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Completed.");
    }

    // Two-pointer palindrome check
    public static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
public class PalindromeCheckerUC4 {

    public static void main(String[] args) {
        String original = "racecar";  // Change this to test other words
        char[] chars = original.toCharArray();
        boolean isPalindrome = true;

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
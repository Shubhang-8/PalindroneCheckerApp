// UC3: Palindrome Check Using String Reverse
public class PalindromeCheckerUC3 {

    public static void main(String[] args) {
        String original = "racecar";  // Change this string to test other words
        String reversed = "";

        // Reverse the string using a loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
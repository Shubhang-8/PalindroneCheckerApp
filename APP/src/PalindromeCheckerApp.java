public class PalindromeCheckerUC2 {

    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Conditional check
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
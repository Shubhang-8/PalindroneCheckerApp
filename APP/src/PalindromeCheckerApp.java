public class UC2_HardcodedPalindrome {
    public static void main(String[] args) {
        // Hardcoded string
        String text = "madam";

        // Clean string (remove spaces, convert to lowercase)
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("✅ \"" + text + "\" is a Palindrome!");
        } else {
            System.out.println("❌ \"" + text + "\" is NOT a Palindrome!");
        }
    }
}
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "level"; // Example input

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome!");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
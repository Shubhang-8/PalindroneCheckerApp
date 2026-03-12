import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class DequePalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Insert characters into deque
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        boolean palindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                palindrome = false;
                break;
            }
        }

        // Print result
        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}
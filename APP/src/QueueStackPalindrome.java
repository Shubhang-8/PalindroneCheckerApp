import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class QueueStackPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Insert characters into queue and stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        boolean palindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while (!queue.isEmpty()) {
            char qChar = queue.remove();  // dequeue
            char sChar = stack.pop();     // pop

            if (qChar != sChar) {
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
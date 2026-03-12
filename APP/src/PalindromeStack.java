public class PalindromeStack {
}
import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop characters to create reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed strings
        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
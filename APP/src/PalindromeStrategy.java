import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker - Strategy Pattern");

        System.out.println("Enter a word:");
        String input = scanner.nextLine();

        System.out.println("Choose Algorithm:");
        System.out.println("1 - Stack Strategy");
        System.out.println("2 - Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeContext context = new PalindromeContext();

        if (choice == 1) {
            context.setStrategy(new StackPalindromeStrategy());
        } else if (choice == 2) {
            context.setStrategy(new DequePalindromeStrategy());
        }

        boolean result = context.execute(input);

        if (result) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }
    }
}
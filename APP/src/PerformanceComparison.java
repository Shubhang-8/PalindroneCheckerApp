import java.util.*;

public class PerformanceComparison {

    // 1. Two Pointer Method
    public static boolean twoPointerPalindrome(String input) {
        String s = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 2. Stack Based Method
    public static boolean stackPalindrome(String input) {

        String s = input.toLowerCase().replaceAll("\\s+", "");

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        for (char c : s.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // 3. Deque Based Method
    public static boolean dequePalindrome(String input) {

        String s = input.toLowerCase().replaceAll("\\s+", "");

        Deque<Character> deque = new LinkedList<>();

        for (char c : s.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    // 4. Recursive Method
    public static boolean recursivePalindrome(String s) {

        s = s.toLowerCase().replaceAll("\\s+", "");
        return checkRecursive(s, 0, s.length() - 1);
    }

    private static boolean checkRecursive(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return checkRecursive(s, start + 1, end - 1);
    }

    // Main Method
    public static void main(String[] args) {

        String test = "A man a plan a canal Panama";

        long start, end;

        // Two Pointer
        start = System.nanoTime();
        boolean r1 = twoPointerPalindrome(test);
        end = System.nanoTime();
        System.out.println("Two Pointer Result: " + r1);
        System.out.println("Execution Time: " + (end - start) + " ns\n");

        // Stack
        start = System.nanoTime();
        boolean r2 = stackPalindrome(test);
        end = System.nanoTime();
        System.out.println("Stack Result: " + r2);
        System.out.println("Execution Time: " + (end - start) + " ns\n");

        // Deque
        start = System.nanoTime();
        boolean r3 = dequePalindrome(test);
        end = System.nanoTime();
        System.out.println("Deque Result: " + r3);
        System.out.println("Execution Time: " + (end - start) + " ns\n");

        // Recursive
        start = System.nanoTime();
        boolean r4 = recursivePalindrome(test);
        end = System.nanoTime();
        System.out.println("Recursive Result: " + r4);
        System.out.println("Execution Time: " + (end - start) + " ns\n");

        System.out.println("Performance Comparison Completed.");
    }
}
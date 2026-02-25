public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;
        Node(char data) { this.data = data; }
    }

    public static void main(String[] args) {
        String str = "racecar"; // Example input

        // Convert string to linked list
        Node head = null, tail = null;
        for (char c : str.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Check palindrome
        if (isPalindrome(head)) {
            System.out.println(str + " is a palindrome!");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Function to check palindrome using linked list
    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle using fast & slow pointers
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverseList(slow.next);
        Node firstHalf = head;

        // Compare halves
        Node p1 = firstHalf, p2 = secondHalf;
        boolean palindrome = true;
        while (p2 != null) {
            if (p1.data != p2.data) {
                palindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Optional: Restore the list (not necessary here)
        slow.next = reverseList(secondHalf);

        return palindrome;
    }

    // Reverse linked list
    private static Node reverseList(Node head) {
        Node prev = null, current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}
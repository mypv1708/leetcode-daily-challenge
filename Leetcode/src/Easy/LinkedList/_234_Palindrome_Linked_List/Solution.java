package Easy.LinkedList._234_Palindrome_Linked_List;

import Easy.LinkedList.ListNode;

public class Solution {
    ListNode node;

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        if (node == null) node = head;

        boolean bool = isPalindrome(head.next);
        if (head.val == node.val) {
            node = node.next;
        } else {
            bool = false;
        }
        return bool;
    }

    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Palindrome (1 → 2 → 2 → 1)
        int[] values1 = {1, 2, 2, 1};
        ListNode head1 = createLinkedList(values1);
        printLinkedList(head1);
        System.out.println("Is Palindrome? " + solution.isPalindrome(head1));

    }
}

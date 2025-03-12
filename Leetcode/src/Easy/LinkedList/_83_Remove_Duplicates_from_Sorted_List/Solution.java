package Easy.LinkedList._83_Remove_Duplicates_from_Sorted_List;

import Easy.LinkedList.ListNode;

import static Easy.LinkedList.Operation.printList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Tạo danh sách liên kết: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Danh sách ban đầu:");
        printList(head);

        // Gọi hàm xóa phần tử trùng nhau
        Solution solution = new Solution();
        ListNode newHead = solution.deleteDuplicates(head);

        System.out.println("Danh sách sau khi loại bỏ phần tử trùng:");
        printList(newHead);
    }
}

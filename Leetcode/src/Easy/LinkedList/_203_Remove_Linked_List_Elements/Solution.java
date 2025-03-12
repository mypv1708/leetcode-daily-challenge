package Easy.LinkedList._203_Remove_Linked_List_Elements;

import Easy.LinkedList.ListNode;

import static Easy.LinkedList.Operation.printList;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;

        while (current != null && current.next != null){
            if (current.next.val == val) {
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
        Easy.LinkedList._203_Remove_Linked_List_Elements.Solution solution = new Easy.LinkedList._203_Remove_Linked_List_Elements.Solution();
        ListNode newHead = solution.removeElements(head,3);

        System.out.println("Danh sách sau khi loại bỏ phần tử:");
        printList(newHead);
    }
}

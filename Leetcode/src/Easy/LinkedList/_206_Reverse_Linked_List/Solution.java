package Easy.LinkedList._206_Reverse_Linked_List;

import Easy.LinkedList.ListNode;

import static Easy.LinkedList.Operation.printList;

public class Solution {
    public ListNode reverseList(ListNode head) {
        // Điều kiện dừng: Nếu danh sách rỗng hoặc chỉ có 1 node, trả về luôn
        if (head == null || head.next == null) {
            return head;
        }

        // Đệ quy đảo ngược phần sau danh sách
        ListNode newHead = reverseList(head.next);

        // Gán node tiếp theo của head trỏ ngược lại về head
        head.next.next = head;

        // Xóa liên kết cũ
        head.next = null;

        // Trả về node đầu tiên của danh sách đã đảo ngược
        return newHead;
    }

    public static void main(String[] args) {
        // Tạo danh sách liên kết: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Danh sách ban đầu:");
        printList(head);

        // Gọi hàm xóa phần tử trùng nhau
        Easy.LinkedList._206_Reverse_Linked_List.Solution solution = new Easy.LinkedList._206_Reverse_Linked_List.Solution();
        ListNode newHead = solution.reverseList(head);

        System.out.println("Danh sách sau khi đảo ngược phần tử:");
        printList(newHead);
    }
}

package Easy.LinkedList._21_Merge_Two_Sorted_Lists;

import Easy.LinkedList.ListNode;

import static Easy.LinkedList.Operation.printList;

public class Solution {
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        // Danh sách liên kết 1: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Danh sách liên kết 2: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Gộp hai danh sách
        ListNode mergedList = mergeTwoLists(l1, l2);

        // In kết quả
        System.out.println("Danh sách đã hợp nhất:");
        printList(mergedList);
    }
}

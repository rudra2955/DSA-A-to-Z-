public class SortLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Main function to sort a linked list
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split into halves
        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null;

        // Step 2: Sort each half
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // Step 3: Merge sorted halves
        return merge(left, right);
    }

    // Helper function to find middle (slow/fast pointer)
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper function to merge two sorted lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Append the remaining nodes
        tail.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    // Utility function to print list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        SortLinkedList list = new SortLinkedList();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        list.printList(head);

        head = list.sortList(head);

        System.out.println("Sorted List:");
        list.printList(head);
    }
}

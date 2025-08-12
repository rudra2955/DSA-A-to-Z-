// ReverseInGroups.java

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class ReverseInGroups {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Step 1: Check if we have at least k nodes to reverse
        ListNode curr = head;
        int count = 0;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // If nodes are less than k, return head without change
        if (count < k) return head;

        // Step 2: Reverse first k nodes
        curr = head;
        ListNode prev = null, next = null;
        count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Step 3: Recursively reverse the rest of the list
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        // prev becomes the new head after reversal
        return prev;
    }

    // Utility to print list
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseInGroups list = new ReverseInGroups();

        // Create linked list [1, 2, 3, 4, 5, 6, 7, 8]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);

        System.out.print("Original List: ");
        list.printList(head);

        // Reverse in groups of size k = 3
        head = list.reverseKGroup(head, 3);

        System.out.print("Reversed in Groups: ");
        list.printList(head);
    }
}

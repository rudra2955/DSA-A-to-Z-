// RotateLinkedList.java

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class RotateLinkedList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Find the length of the list
        int length = 1; // start at 1 because we're already at head
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Connect tail to head (make it circular)
        tail.next = head;

        // Step 3: Find the new head position
        k = k % length; // in case k > length
        int stepsToNewHead = length - k;

        // Step 4: Traverse to the new tail
        ListNode newTail = tail;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        // Step 5: Set new head and break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
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
        RotateLinkedList list = new RotateLinkedList();

        // Create linked list [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        list.printList(head);

        // Rotate by k = 2
        head = list.rotateRight(head, 2);

        System.out.print("Rotated List:  ");
        list.printList(head);
    }
}

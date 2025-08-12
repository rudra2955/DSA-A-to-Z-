// RemoveNthNodeFromEnd.java
// Remove N-th node from the end of Linked List

class RemoveNthNodeFromEnd {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy, second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove node
        second.next = second.next.next;
        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = removeNthFromEnd(head, 2);
        printList(head); // Output: 1 -> 2 -> 3 -> 5 -> null
    }
}


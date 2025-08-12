// DetectCycle.java
// Detect a cycle in Linked List using Floyd's Cycle Detection Algorithm

class DetectCycle {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public static boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next; // Creates a cycle

        System.out.println("Has Cycle? " + hasCycle(head)); // Output: true
    }
}

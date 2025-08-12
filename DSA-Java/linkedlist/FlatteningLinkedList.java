// FlatteningLinkedList.java

class Node {
    int data;
    Node next;
    Node child;

    Node(int data) {
        this.data = data;
        next = null;
        child = null;
    }
}

public class FlatteningLinkedList {

    // Merge two sorted linked lists (based on child pointer)
    private Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data < b.data) {
            result = a;
            result.child = merge(a.child, b);
        } else {
            result = b;
            result.child = merge(a, b.child);
        }
        result.next = null; // Ensure 'next' is null after merge
        return result;
    }

    // Flatten the list starting from head
    public Node flatten(Node head) {
        if (head == null || head.next == null) return head;

        // Flatten the rest of the list
        head.next = flatten(head.next);

        // Merge current list with the next list
        head = merge(head, head.next);

        return head;
    }

    // Utility to print flattened list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.child;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        FlatteningLinkedList list = new FlatteningLinkedList();

        // Creating sample structure
        Node head = new Node(5);
        head.child = new Node(7);
        head.child.child = new Node(8);
        head.child.child.child = new Node(30);

        Node n10 = new Node(10);
        n10.child = new Node(20);
        head.next = n10;

        Node n19 = new Node(19);
        n19.child = new Node(22);
        n19.child.child = new Node(50);
        n10.next = n19;

        Node n28 = new Node(28);
        n28.child = new Node(35);
        n28.child.child = new Node(40);
        n28.child.child.child = new Node(45);
        n19.next = n28;

        // Flatten and print
        head = list.flatten(head);
        list.printList(head);
    }
}

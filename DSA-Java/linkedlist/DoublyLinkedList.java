// DoublyLinkedList.java
// Basic implementation of Doubly Linked List in Java

class DoublyLinkedList {
    static class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.displayForward(); // Output: 1 <-> 2 <-> 3 <-> null
    }
}

package T05_LinkedList;

// Node class represents a node in the linked list
public class Node {
    int data; // data of the node
    Node next; // Pointer to next node

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        next = null;
    }
}

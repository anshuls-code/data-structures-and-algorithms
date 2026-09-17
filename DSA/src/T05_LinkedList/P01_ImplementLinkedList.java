package T05_LinkedList;

public class P01_ImplementLinkedList {
    static void main() {
        int[] arr = {1, 2, 3, 4};

        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
    }
}

public class DeleteLinkList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void PrintNode() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

    }

    void deleteLL(int key) {
        Node temp, prev = null;

        temp = head;
        if (temp != null && temp.data == key) {
            head = temp.next;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }

    public static void main(String[] argv) {
        DeleteLinkList delete = new DeleteLinkList();
        delete.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        delete.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = null;
        delete.PrintNode();
        delete.deleteLL(3);
        System.out.println();
        delete.PrintNode();

    }
}

public class LinkList2 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }
    }

    void PrintLinkList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    void insertStart(int data) {
        Node newLinkList = new Node(data);
        newLinkList.next = head;
        head = newLinkList;
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);

        }
        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;

        }
        last.next = newNode;

    }

    void insertAnyWhere(int data, Node Prv) {
        if (Prv == null) {
            System.out.println("Null Previous Node");
        }
        Node new_node = new Node(data);
        new_node.next = Prv.next;
        Prv.next = new_node;

    }

    public static void main(String[] argv) {
        LinkList2 newlinklist = new LinkList2();
        newlinklist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        newlinklist.head.next = second;
        second.next = third;
        newlinklist.insertStart(5);
        newlinklist.insertLast(6);
        newlinklist.insertAnyWhere(300, newlinklist.head);
        newlinklist.PrintLinkList();
    }
}

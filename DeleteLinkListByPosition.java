public class DeleteLinkListByPosition {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void PrintList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    void pushList(int d) {
        Node newData = new Node(d);
        newData.next = head;
        head = newData;
    }

    void deletePosition(int position) {
        Node temp = head;
        if (position == 0) {
            head = temp.next;
        }

        for (int i = 0; temp != null & i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

    }

    public static void main(String[] argv) {
        DeleteLinkListByPosition list = new DeleteLinkListByPosition();
        // list.head = new Node(1);
        list.pushList(0);
        list.pushList(1);
        list.pushList(2);
        list.pushList(3);
        list.pushList(4);
        list.pushList(5);
        list.pushList(6);
        list.PrintList();
        list.deletePosition(1);
        System.out.println();
        list.PrintList();

    }
}

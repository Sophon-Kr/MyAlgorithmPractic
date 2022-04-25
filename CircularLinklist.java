public class CircularLinklist {
    static class Node {
        Node next;
        int data;

    }

    static void PrintNode(Node head) {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    static Node push(Node head_ref, int data) {
        Node temp = head_ref;
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = head_ref;

        if (head_ref != null) {
            while (temp.next != head_ref) {
                temp = temp.next;

            }
            temp.next = new_node;
        } else {
            new_node.next = new_node;
        }
        head_ref = new_node;
        return head_ref;

    }

    public static void main(String[] argv) {
        Node head = null;
        head = push(head, 1);
        head = push(head, 1);
        head = push(head, 1);
        PrintNode(head);
        
    }
}

public class MergeLinklist {
    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        };

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    void PrintList() {
        ListNode data = head;
        while (data != null) {
            System.out.print(data.val + " ");
            data = data.next;
        }
    }

    public static void main(String[] argv) {
        MergeLinklist list1 = new MergeLinklist();
        list1.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        list1.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = null;

        MergeLinklist list2 = new MergeLinklist();
        list2.head = new ListNode(1);
        ListNode second2 = new ListNode(3);
        ListNode third2 = new ListNode(4);
        ListNode forth2 = new ListNode(5);
        list2.head.next = second2;
        second2.next = third2;
        third2.next = forth2;
        forth2.next = null;
        list1.PrintList();
        System.out.println();
        list2.PrintList();
        System.out.println();

        ListNode newhead = mergeTwoLists(list1.head, list2.head);
        MergeLinklist list3 = new MergeLinklist();
        list3.head = newhead;
        list3.PrintList();

    }
}

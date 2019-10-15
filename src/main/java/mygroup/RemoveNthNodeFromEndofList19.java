package mygroup;

public class RemoveNthNodeFromEndofList19 {
    public static void main(String[] args) {
        LinkedListNode head  = new LinkedListNode();
        LinkedListNode node1 = new LinkedListNode();
        LinkedListNode node2 = new LinkedListNode();
        LinkedListNode node3 = new LinkedListNode();
        LinkedListNode node4 = new LinkedListNode();
        LinkedListNode node5 = new LinkedListNode();

        head.setValue(0);
        head.setNext(node1);

        node1.setValue(1);
        node1.setNext(node2);

        node2.setValue(2);
        node2.setNext(node3);

        node3.setValue(3);
        node3.setNext(node4);

        node4.setValue(4);
        node4.setNext(node5);

        node5.setValue(5);
        node5.setNext(null);

        printAllLinkedList(head);
        printAllLinkedList(removeNthFromEnd(head,6));
    }

    public static LinkedListNode removeNthFromEnd(LinkedListNode head, int n) {

        LinkedListNode fast = head;
        LinkedListNode slow = head;

        while(n>0){
            fast=fast.next;
            n--;
        }

        if(fast==null) return head.next;

        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;

        return head;
    }

    public static void printAllLinkedList(LinkedListNode head){
        System.out.println(head.value);
        while(head.next!=null){
            System.out.println(head.next.value);
            head=head.next;
        }
    }
}

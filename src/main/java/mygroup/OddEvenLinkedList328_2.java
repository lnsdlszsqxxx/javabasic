package mygroup;

public class OddEvenLinkedList328_2 {
    public static void main(String[] args) {

        LinkedListNode head  = new LinkedListNode();
        LinkedListNode node1 = new LinkedListNode();
        LinkedListNode node2 = new LinkedListNode();
        LinkedListNode node3 = new LinkedListNode();
        LinkedListNode node4 = new LinkedListNode();
        LinkedListNode node5 = new LinkedListNode();
        LinkedListNode temp;

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

        printNode(head);
        head = oddEvenList(head);
        printNode(head);
    }

    public static LinkedListNode oddEvenList(LinkedListNode head) {
        if(head==null||head.next==null||head.next.next==null) return head;

        LinkedListNode secondNode = head.next;
        LinkedListNode oddNode = head;
        LinkedListNode evenNode = head.next;

        while (oddNode.next!=null&&evenNode.next!=null){
            oddNode.next=oddNode.next.next;
            oddNode=oddNode.next;

            evenNode.next=evenNode.next.next;
            evenNode=evenNode.next;
        }

        oddNode.next=secondNode;

        return head;
    }

    public static void printNode(LinkedListNode head) {
        while (head!=null){
            System.out.println(head.value);
            head=head.next;
        }
    }

}

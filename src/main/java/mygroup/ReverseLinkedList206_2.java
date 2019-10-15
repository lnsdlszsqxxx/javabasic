package mygroup;

public class ReverseLinkedList206_2 {
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
        LinkedListNode result = reverseList(head);
        printAllLinkedList(result);
    }

    public static LinkedListNode reverseList(LinkedListNode head) {
        if(head==null||head.next==null) return head;
        LinkedListNode nextNode = new LinkedListNode();
        LinkedListNode currentNode = new LinkedListNode();
        LinkedListNode temp = new LinkedListNode();

        int flag=0;

        currentNode = head;
        nextNode = head.next;
        while(nextNode!=null){
            copyTo(temp,nextNode);
            nextNode.next=currentNode;
            currentNode=nextNode;
            nextNode=temp.next;
        }

        head.next=null;
        return currentNode;
    }

    public static void printAllLinkedList(LinkedListNode head){
        System.out.println(head.value);
        while(head.next!=null){
            System.out.println(head.next.value);
            head=head.next;
        }
    }

    public static void copyTo(LinkedListNode node2, LinkedListNode node1){
        node2.value=node1.value;
        node2.next=node1.next;
    }

}

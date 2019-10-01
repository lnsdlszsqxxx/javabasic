package mygroup;

public class DeleteNodeinaLinkedList237 {
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

        printLinkedList(head);
        deleteNode(node3);
        printLinkedList(head);

        //for practice purpose
//        LinkedListNode result = reverse(head);
//        printLinkedList(result);
    }

    public static void deleteNode(LinkedListNode node) {
        node.value=node.next.value;
        node.next =node.next.next;
    }

    public static void printLinkedList(LinkedListNode head){
        while(head.next!=null){
            System.out.println(head.value);
            head = head.next;
        }
        System.out.println(head.value);
    }

    public static LinkedListNode reverse(LinkedListNode head){
        if(head==null || head.next==null) return head;

        LinkedListNode currentNode=head;
        LinkedListNode nextNode=currentNode.next;
        LinkedListNode tempNode=new LinkedListNode();
        while (nextNode != null) {
            copyNode(tempNode,nextNode);
            nextNode.next=currentNode;
            currentNode=nextNode;
            nextNode=tempNode.next;
        }
        head.next=null;

        return currentNode;
    }

    public static void copyNode(LinkedListNode to, LinkedListNode from){
        to.value=from.value;
        to.next=from.next;
    }
}

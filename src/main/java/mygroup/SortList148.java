package mygroup;

import sun.awt.image.ImageWatched;

public class SortList148 {
    public static void main(String[] args) {

        LinkedListNode head  = new LinkedListNode();
        LinkedListNode node1 = new LinkedListNode();
        LinkedListNode node2 = new LinkedListNode();
        LinkedListNode node3 = new LinkedListNode();
        LinkedListNode node4 = new LinkedListNode();
        LinkedListNode node5 = new LinkedListNode();
        LinkedListNode temp;

        head.setValue(5);
        head.setNext(node1);

        node1.setValue(1);
        node1.setNext(node2);

        node2.setValue(0);
        node2.setNext(node3);

        node3.setValue(3);
        node3.setNext(node4);

        node4.setValue(2);
        node4.setNext(node5);

        node5.setValue(4);
        node5.setNext(null);

        printNode(head);
        head = sortList(head);
        printNode(head);
    }

    public static LinkedListNode sortList(LinkedListNode head) {

        LinkedListNode currentNode = head;
        LinkedListNode nextNode = head.next;
        int n=0;
        int flag=0;

        while (currentNode!=null){
            currentNode=currentNode.next;
            n++;
        }

        for(int i=0;i<n-1;i++){
            currentNode=head;
            nextNode=currentNode.next;
            while(nextNode!=null){
                if(currentNode.value>nextNode.value) swap(currentNode,nextNode);
                currentNode=nextNode;
                nextNode=nextNode.next;
            }
        }
        return head;
    }

    public static void swap(LinkedListNode node1, LinkedListNode node2){
        LinkedListNode temp = new LinkedListNode();
        temp.value=node1.value;

        node1.value=node2.value;

        node2.value=temp.value;
    }

    public static void printNode(LinkedListNode head) {
        while (head!=null){
            System.out.println(head.value);
            head=head.next;
        }
    }

}

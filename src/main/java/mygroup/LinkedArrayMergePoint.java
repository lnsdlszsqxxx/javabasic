package mygroup;

import java.util.HashSet;
import java.util.Set;

public class LinkedArrayMergePoint {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode();
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
        node5.setNext(node2);

        LinkedListNode mergePoint = mergePoint(head);

        System.out.println(mergePoint.getValue());
    }

    public static LinkedListNode mergePoint(LinkedListNode head){
        Set<LinkedListNode> isSame = new HashSet<>();
        int sizeBefore=0;
        int sizeAfter=0;
        isSame.add(head);
        while (head.getNext()!=null){
            sizeBefore=isSame.size();
            isSame.add(head.getNext());
            sizeAfter=isSame.size();
            if(sizeAfter==sizeBefore) return head.getNext();
            head = head.getNext();
        }
        return null;
    }
}

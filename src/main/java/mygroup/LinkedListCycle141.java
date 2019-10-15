package mygroup;

import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle141 {
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
        node5.setNext(node2);

        System.out.println(hasCycle(head));

    }
    public static boolean hasCycle(LinkedListNode head) {

        Set<LinkedListNode> set = new HashSet<>();

        while (head!=null){
            int size1=set.size();
            set.add(head);
            int size2=set.size();
            if(size1==size2) return true;
            head=head.next;
        }
        return false;
    }
}

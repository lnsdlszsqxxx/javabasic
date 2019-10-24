package mygroup;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList234 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        head1.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=null;

        System.out.println(isPalindrome(head1));

    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head!=null){
            list.add(head.value);
            head=head.next;
        }

        return  isPal(list);
    }

    public static boolean isPal(List<Integer> list){
        int n=list.size();
        int i=0;
        int j=n-1;
        while(i<j){
            if(list.get(i++)!=list.get(j--)) return false;
        }

        return true;
    }
}

package mygroup;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList234_2 {
    static ListNode root = new ListNode();

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        System.out.println(isPalindrome(head1));

    }


    public static boolean isPalindrome(ListNode head) {
        root = head;

        boolean flag = isPalindrome2(head);

        return flag;
    }

    public static boolean isPalindrome2(ListNode head) {
        boolean flag = true;
        if (head==null) return true;
        else  {
            flag=isPalindrome2(head.next);
        }

        if (flag && root.value==head.value){
            root=root.next;
            return true;
        }

        return false;
    }
}
package mygroup;

public class ListNode {
    int value;
    ListNode next;

    public ListNode(){}
    public ListNode(int value){
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}

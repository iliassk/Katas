import java.util.Objects;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    private int val;
    private ListNode next;

    ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return getVal() == listNode.getVal() &&
                Objects.equals(getNext(), listNode.getNext());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVal(), getNext());
    }
}
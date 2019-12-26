import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class E01 {

    public ListNode reverseList(ListNode listToReverse) {
        if (listToReverse != null && listToReverse.getNext() != null) {
            List<Integer> numbers = new ArrayList<>();
            getAllNodeValues(listToReverse, numbers);
            Collections.reverse(numbers);
            return chainNodes(numbers);
        }
        return listToReverse;
    }

    private void getAllNodeValues(ListNode listToReverse, List<Integer> numbers) {
        numbers.add(listToReverse.getVal());
        if (listToReverse.getNext() != null) {
            getAllNodeValues(listToReverse.getNext(), numbers);
        }
    }

    private ListNode chainNodes(List<Integer> numbers) {
        if (numbers.size() > 1) {
            ListNode node = new ListNode(numbers.get(0));
            numbers.remove(0);
            node.setNext(chainNodes(numbers));
            return node;
        }
        return new ListNode(numbers.get(0));
    }

}
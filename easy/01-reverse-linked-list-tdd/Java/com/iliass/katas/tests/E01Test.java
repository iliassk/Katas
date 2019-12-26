import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class E01Test {

    E01 solution;

    @BeforeEach
    public void setUp() {
        solution = new E01();
    }

    @DisplayName("Should reverse a ListNode with only one element")
    @Test
    public void testOne() {
        ListNode actualList = createListNodeTestValues(Arrays.asList(1));
        assertThat(actualList.equals(solution.reverseList(actualList))).isTrue();
    }

    @DisplayName("Should reverse a ListNode with at max two elements")
    @Test
    public void testTwo() {
        ListNode actualList = createListNodeTestValues(Arrays.asList(1, 2));

        ListNode expectedList = createListNodeTestValues(Arrays.asList(2, 1));

        assertThat(expectedList.equals(solution.reverseList(actualList))).isTrue();
    }

    @DisplayName("Should reverse a ListNode with more than two elements")
    @Test
    public void testThree() {
        ListNode actualList = createListNodeTestValues(Arrays.asList(4, 2, 6));

        ListNode expectedList = createListNodeTestValues(Arrays.asList(6, 2, 4));

        assertThat(expectedList.equals(solution.reverseList(actualList))).isTrue();
    }

    private ListNode createListNodeTestValues(List<Integer> numbers) {
        return chainNodes(new LinkedList(numbers));
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
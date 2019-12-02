import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class E01Test {

    E01 solution;

    @BeforeEach
    public void setUp() {
        solution = new E01();
    }

    @Test
    public void shouldReverseAListWithOnlyOneElement() {
        ListNode actualList = new ListNode(1);
        assertThat(actualList.equals(solution.reverseList(actualList))).isTrue();
    }

    @Test
    public void shouldReverseAListWithTwoElements() {
        ListNode actualList = new ListNode(1);
        actualList.setNext(new ListNode(2));

        ListNode expectedList = new ListNode(2);
        expectedList.setNext(new ListNode(1));

        assertThat(expectedList.equals(solution.reverseList(actualList))).isTrue();
    }

}
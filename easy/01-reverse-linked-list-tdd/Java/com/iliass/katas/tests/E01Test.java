import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.assertj.core.api.Assertions.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class E01Test {

    E01 solution;

    @BeforeEach
    public void setUp() {
        solution = new E01();
    }

    @Test
    public void shouldReverseAListWithOnlyNullValues() {
        List<Integer> numbers = Arrays.asList(null, null, null);

        assertThat(numbers.equals(solution.reverseList(numbers))).isTrue();
    }
}
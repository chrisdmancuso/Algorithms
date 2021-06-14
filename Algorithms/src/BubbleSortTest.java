import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private BubbleSort bubbleSort;

    @BeforeEach
    public void setUp() throws Exception {
        bubbleSort = new BubbleSort();
    }

    @Test
    @DisplayName("Testing Bubble Sort on a simple array")
    public void positiveTest() {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        BubbleSort.sort(actual);
        assertArrayEquals(expected, actual, "Bubble should properly sort");
    }
}
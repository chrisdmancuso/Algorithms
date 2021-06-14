import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    private SelectionSort selectionSort;

    @BeforeEach
    public void setUp() throws Exception {
        selectionSort = new SelectionSort();
    }

    @Test
    @DisplayName("Testing Selection Sort on a simple array")
    public void positiveTest() {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        SelectionSort.sort(actual);
        assertArrayEquals(expected, actual, "Selection should properly sort");
    }
}
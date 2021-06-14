import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    private MergeSort mergeSort;

    @BeforeEach
    public void setUp() throws Exception {
        mergeSort = new MergeSort();
    }

    @Test
    @DisplayName("Testing Merge Sort on simple array")
    public void positiveTest() {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual, "MergeSort should properly sort");
    }
}
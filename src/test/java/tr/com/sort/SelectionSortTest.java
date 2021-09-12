package tr.com.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static tr.com.sort.SortingAlgorithms.selectionSort;

public class SelectionSortTest {
    Integer[] integers = null;
    Integer[] sorted = new Integer[]{1, 3, 4, 21, 23, 45};

    @Before
    public void initialize() {
        integers = new Integer[]{23, 1, 4, 45, 21, 3};
    }

    @Test
    public void selectionSortTest() {
        selectionSort(integers);
        assertArrayEquals(integers, sorted);
    }
}
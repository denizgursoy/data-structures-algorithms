package tr.com.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SelectionSortTest {
    List<Integer> integers = null;
    List<Integer> sorted = new ArrayList(List.of(1, 3, 4, 21, 23, 45));

    @Before
    public void initialize() {
        integers = new ArrayList(List.of(23, 1, 4, 45, 21, 3));
    }

    @Test
    public void test() {
        SortingAlgorithms.sort(integers);
        assertArrayEquals(integers.toArray(), sorted.toArray());
    }
}

package tr.com.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static tr.com.sort.SortingAlgorithms.*;

public class SortingAlgorithmsTests {
    Integer[] integers = null;
    Integer[] sorted = null;

    @Before
    public void initialize() {
        integers = new Random().ints(0, 999).limit(50).boxed().toArray(Integer[]::new);
        sorted = Arrays.stream(integers).sorted().toArray(Integer[]::new);
    }

    @Test
    public void selectionSortTest() {
        selectionSort(integers);
        assertArrayEquals(integers, sorted);
    }

    @Test
    public void bubbleSortTest() {
        bubbleSort(integers);
        assertArrayEquals(integers, sorted);
    }

    @Test
    public void insertionSortTest() {
        insertionSort(integers);
        assertArrayEquals(integers, sorted);
    }

    @Test
    public void shellSortTest() {
        shellSort(integers);
        assertArrayEquals(integers, sorted);
    }

    @Test
    public void quickSortTest(){
        quickSort(integers);
        assertArrayEquals(integers, sorted);
    }
}

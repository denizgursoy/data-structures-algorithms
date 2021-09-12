package tr.com.sort;

import static tr.com.utils.Commons.lessThan;
import static tr.com.utils.Commons.swap;

public class SortingAlgorithms {

    public static <T extends Comparable<T>> void selectionSort(T[] array) {

        int N = array.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if( lessThan(array[j], array[min])) min= j;
            }
            swap(array,min,i);
        }
    }
}


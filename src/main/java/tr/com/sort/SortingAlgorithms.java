package tr.com.sort;

import static tr.com.utils.Commons.lessThan;
import static tr.com.utils.Commons.swap;

public class SortingAlgorithms {

    public static <T extends Comparable<T>> void selectionSort(T[] array) {

        int N = array.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (lessThan(array[j], array[min])) min = j;
            }
            swap(array, min, i);
        }
    }


    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int N = array.length;
        for (int i = 0; i < N - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < N - i - 1; j++) {

                if (lessThan(array[j + 1], array[j])) {
                    swapped = true;
                    swap(array, j, j + 1);
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        int N = array.length;

        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && lessThan(array[j], array[j - 1]); j--) {
                swap(array, j, j - 1);
            }
        }

    }

    public static <T extends Comparable<T>> void shellSort(T[] array) {
        int N = array.length;
        int h = 1;

        while (h < N / 3) h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && lessThan(array[j], array[j - h]); j -= h) {
                    swap(array, j, j - h);
                }
            }
            h /= 3;
        }
    }

    public static <T extends Comparable<T>> void quickSort(T[] array) {
        sortByQuickSort(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void sortByQuickSort(T[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, 0, high);

            sortByQuickSort(array, low, pi - 1);
            sortByQuickSort(array, pi + 1, high);
        }
    }

    public static <T extends Comparable<T>> int partition(T[] array, int low, int high) {
        int pivot = high;
        int i = low - 1;

        for (int j = low; j <= high-1; j++) {
            if (lessThan(array[j],array[pivot])) {
                i++;
                swap(array,j,i);
            }
        }
        swap(array,i+1,pivot);
        return i+1;
    }


}


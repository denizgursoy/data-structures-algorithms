package tr.com.utils;

public class Commons {
    public static <T extends Comparable<T>> boolean lessThan(T a, T b) {
        return a.compareTo(b) < 0;
    }

    public static <T extends Comparable<T>> void swap(T[] array, int source, int target) {
        T sourceValue = array[source];
        array[source] = array[target];
        array[target] = sourceValue;
    }

}

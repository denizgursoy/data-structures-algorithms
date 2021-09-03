package tr.com.sort;

import java.util.Collections;
import java.util.List;

import static tr.com.utils.Commons.lessThan;

public class SortingAlgorithms {

    public static void sort(List<? extends Comparable> list) {

        int N = list.size();

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++) {
                min = lessThan(list.get(j), list.get(min)) ? j : min;
            }
            Collections.swap(list, min, i);
        }
    }
}


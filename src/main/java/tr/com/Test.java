package tr.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> collect =
                Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .filter(sayi -> sayi > 3)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

}


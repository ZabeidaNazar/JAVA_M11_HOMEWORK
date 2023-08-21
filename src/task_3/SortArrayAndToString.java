package task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortArrayAndToString {
    public static String sortArray(String[] stringsOfNumbers) {
        return Stream.of(stringsOfNumbers)
                .flatMap(stringOfNumbers -> Arrays.stream(stringOfNumbers.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] inputArray = {"9, 8, 6, 7, 10", "1, 2, 0", "4, 5", "3"};

        String result = sortArray(inputArray);

        System.out.println(result);
    }
}

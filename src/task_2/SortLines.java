package task_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static List<String> sortLines(Collection<String> lines) {
        return lines.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("James");
        list.add("Peter");
        list.add("Robert");
        list.add("Mary");
        list.add("Patricia");
        list.add("Jennifer");
        list.add("David");
        list.add("Susan");
        list.add("Elizabeth");
        list.add("Joseph");
        list.add("Thomas");
        list.add("Lisa");
        list.add("Nancy");

        List<String> resultsList = sortLines(list);

        for (String line : resultsList) {
            System.out.println(line);
        }
    }
}

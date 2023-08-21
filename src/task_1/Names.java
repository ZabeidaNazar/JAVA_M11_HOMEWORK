package task_1;

import javax.sql.rowset.spi.SyncResolver;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Names {
    public static String nameParser(Collection<String> names) {
        AtomicInteger i = new AtomicInteger(0);
        ArrayList<String> namesList = new ArrayList<>(names);
        return names.stream()
                .filter(name -> namesList.indexOf(name) % 2 == 0)
                .map(name -> namesList.indexOf(name) + 1 + ". " + name)
                .collect(Collectors.joining(", "));
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


        String namesLine = nameParser(list);
        System.out.println(namesLine);
    }
}

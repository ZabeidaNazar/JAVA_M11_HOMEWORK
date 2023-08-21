package task_4;

import java.util.stream.Stream;

public class InfinityStream {
    public static Stream<Long> generateInfinityStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {

        Stream<Long> longStream = generateInfinityStream(25214903917L, 11, 2^48, 56);

        longStream.limit(10).forEach(System.out::println);
    }
}

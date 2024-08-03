package etc.exam.handle;

import java.util.stream.IntStream;

public class StreamHandle {

    public static void main(String[] args) {
        int n = 5;
        int result = (n % 2) != 0
                ? IntStream.rangeClosed(1, n)
                .filter(num -> num % 2 != 0)
                .sum()
                : IntStream.rangeClosed(1, n)
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .sum();
    }
}

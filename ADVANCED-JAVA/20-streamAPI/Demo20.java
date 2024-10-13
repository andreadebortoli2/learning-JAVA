import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Demo20 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        nums.forEach(n -> System.out.println(n));

        System.out.println("-----");

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // stream can only be operated one(1) time
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result1 = s3.reduce(0, (c, e) -> c + e);

        System.out.println("extended " + result1);

        // i can make multiple operation in one line

        int result2 = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e);

        System.out.println("one line " + result2);

        System.out.println("-----");

        // parallel stream

        int size = 10_000;

        List<Integer> numList = new ArrayList<>(size);

        Random r = new Random();
        for (int i = 0; i < size; i++) {
            numList.add(r.nextInt(100));
        }

        long start1 = System.currentTimeMillis();
        int sum1 = numList.stream()
                .map(n -> { // adding sleep time to better see the differernce
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int sum2 = numList.parallelStream()
                .map(n -> { // adding sleep time to better see the differernce
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();
        long end2 = System.currentTimeMillis();

        System.out.println("sum: s " + sum1 + " - p " + sum2);
        System.out.println("time: s " + (end1 - start1) + " - p " + (end2 - start2));
    }
}
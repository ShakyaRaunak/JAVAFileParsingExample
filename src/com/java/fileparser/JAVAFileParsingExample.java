package com.java.fileparser;

import org.apache.commons.lang3.time.StopWatch;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.function.Consumer;

/**
 * Created by raunakshakya on 6/18/15.
 */
public class JAVAFileParsingExample {

    public static void main(String[] args) throws IOException, ParseException {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        // external iterator
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer e : numbers) {
            System.out.println(e);
        }

        // internal iterator
        numbers.forEach(new Consumer<Integer>() {
            public void accept(Integer value) {
                System.out.println(value);
            }
        });
        */

        // numbers.forEach((Integer value) -> System.out.println(value));

        // numbers.forEach(value -> System.out.println(value));

        // numbers.forEach(System.out::println);

        int result = 0;
        /*
        for (int e : numbers) {
            result += e * 2;
        }
        System.out.println(result);
        */
/*
        System.out.println(
                numbers.stream()
                        .map(e -> e * 2)
                        .reduce(0, (c, e) -> c + e));
*/

        /*
        for (int e : numbers) {
            if (e > 3 && e % 2 == 0) {
                result = e * 2;
                break;
            }
        }
        System.out.println(result);
        */

/*
        System.out.println(
                numbers.stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .findFirst());  // Optional[8] i.e. there are times when no value, may be null
*/

/*
        System.out.println(
                numbers.stream()
                        .filter(Sample::isGT3)
                        .filter(Sample::isEven)
                        .map(Sample::doubleIt)
                        .findFirst());
*/

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        System.out.println(
                numbers.stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .findFirst());

        stopWatch.stop();

        long timeTaken = stopWatch.getTime();
        System.out.println(timeTaken);
    }

    public static boolean isGT3(Integer number) {
        System.out.println("isGT3 for " + number);
        return number > 3;
    }

    public static boolean isEven(Integer number) {
        System.out.println("isEven for " + number);
        return number % 2 == 0;
    }

    public static int doubleIt(Integer number) {
        System.out.println("doubleIt for " + number);
        return number * 2;
    }

}

package com.java.fileparser;

import org.apache.commons.lang3.time.StopWatch;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

        for (int e : numbers) {
            result += e * 2;
        }
        System.out.println(result);


        System.out.println(
                numbers.stream()
                        .map(e -> e * 2)
                        .reduce(0, (c, e) -> c + e));



        for (int e : numbers) {
            if (e > 3 && e % 2 == 0) {
                result = e * 2;
                break;
            }
        }
        System.out.println(result);



        System.out.println(
                numbers.stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .findFirst());  // Optional[8] i.e. there are times when no value, may be null



        // lazy & composition rather than mutability
        System.out.println(
                numbers.stream()
                        .filter(JAVAFileParsingExample::isGT3)
                        .filter(JAVAFileParsingExample::isEven)
                        .map(JAVAFileParsingExample::doubleIt)
                        .findFirst());



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


        Predicate<Integer> isGreaterThan3 = number -> number > 3;
        Function<Integer, Predicate<Integer>> isGreaterThan = pivot ->
                number -> number > pivot;

        final Stream<Integer> temp = numbers.stream()
                .filter(isGreaterThan.apply(3))
                .filter(JAVAFileParsingExample::isEven)
                .map(JAVAFileParsingExample::doubleIt);
        System.out.println(temp
                .findFirst());



        // prime number check
//        System.out.println(isPrime(1));
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(3));
//        System.out.println(isPrime(4));


        numbers.stream()
                .map(e -> e * e)
                .forEach(System.out::println);


        // initialization of Thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();

        new Thread(
                () -> System.out.println("Hello from thread")
        ).start();


        // Squaring and summing a list of numbers
        int sum = numbers.stream()
                .map(x -> x * x)
                .reduce((x, y) -> x + y).get();
        System.out.println(sum);
    }

    private static boolean isPrime(final int number) {
        // imperative -saying how
        // mutability
        /*
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
        */

        // Declarative
        // what
        // immutability
        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(index -> number % index == 0);


        //Predicate<Integer> isDivisible = divisor -> number % divisor == 0;

        /*return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(index -> isDivisible(index));*/


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

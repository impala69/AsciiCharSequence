package JavaCoreError;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;

public class ghk {
    public static void main(String[] args) {
        Comparator < Map.Entry < String, Integer >> c1 = comparingByValue(Comparator.reverseOrder());
        Comparator< Map.Entry < String, Integer >> c2 = Map.Entry.comparingByKey();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stream< String > stream = in .lines();
        stream.flatMap(l -> Stream.of(l.split("[^а-яА-Яa-zA-Z0-9]+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(x -> x, Collectors.summingInt(p -> 1)))
                .entrySet()
                .stream()
                .sorted(c1.thenComparing(c2))
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }
}
   /* public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stream< String > stream = in .lines();
        stream.flatMap(l -> Stream.of(l.split("[^а-яА-Яa-zA-Z0-9]+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(x -> x, Collectors.summingInt(p -> 1)))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if(e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
                    else return e2.getValue().compareTo(e1.getValue());})
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }*/

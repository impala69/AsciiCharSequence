package JavaCoreError;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ддд {

}
class aaa {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.lines()
        .flatMap(l -> Stream.of(l.split("[^а-яА-Яa-zA-Z0-9]+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(x -> x, Collectors.summingInt(p -> 1)))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (e1.getValue() == e2.getValue()) {
                        return e1.getKey().compareTo(e2.getKey());
                    } else {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                })
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }
}

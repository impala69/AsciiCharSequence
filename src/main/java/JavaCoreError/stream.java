package JavaCoreError;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {
    public static IntStream pseudoRandomStream(int seed) {
       return IntStream.iterate(seed,operand -> ((operand*operand)/10 % 1000));
    }
    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<? extends T> myList =stream.sorted(order).collect(Collectors.toList());
        if(myList.isEmpty()){
            minMaxConsumer.accept(null,null);
        }else {
            minMaxConsumer.accept(myList.get(0),myList.get(myList.size()-1));
        }
    }
}


package JavaCoreError;

import java.util.function.BiConsumer;

public class teeee {
    class Pair<T, U> {
        // вариант 1
        public void ifPresent(BiConsumer<T, U> consumer) {  }
        // вариант 2
        //public void ifPresent(BiConsumer<? super T, ? super U> consumer) { }
        // вариант 3
        //public void ifPresent(BiConsumer<? extends T, ? extends U> consumer) {  }
        // вариант 4
        //public void ifPresent(BiConsumer<?, ?> consumer) {  }
        // вариант 5
        //public <X, Y> void ifPresent(BiConsumer<X, Y> consumer) {  }
    }
}

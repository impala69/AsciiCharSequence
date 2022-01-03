package JavaCoreError;

import java.util.Arrays;

public class dorab {
    public static class DynamicArray < T > {
        private Object[] arrays = new Object[10];
        private int razmer = 0;
        public DynamicArray() {}
        public void add(T el) {
            if (razmer == arrays.length) {
                arrays = Arrays.copyOf(arrays, arrays.length * 2);
            }
            arrays[razmer] = el;
            razmer++;

        }
        public void remove(int index) {
            System.arraycopy(arrays, index + 1, arrays, index, arrays.length - index - 1);
        }
        public T get(int index) {
            return (T) arrays[index];
        }

    }
}

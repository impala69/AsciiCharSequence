import java.lang.CharSequence;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    public  AsciiCharSequence(byte[] array) {
        this.array = array;
    }
    private byte [] array;

    @Override
    public int  length() {
        return array.length;
    }
    @Override
    public char charAt(int index) {
        return (char)(int)array[index];
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(array,start,end));
    }
    @Override
    public String toString() {
       return new String(array);
    }
}



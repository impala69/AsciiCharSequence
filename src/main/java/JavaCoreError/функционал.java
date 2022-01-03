package JavaCoreError;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class функционал {
    public UnaryOperator sqrt(){
        UnaryOperator<Integer> unaryOperator=a->a*a;
        return unaryOperator;
}
public interface NumberGenerator<T extends Number>{
    boolean cond(T arg);
}
public static NumberGenerator<? super Number> getGenerator() {
        return numb -> numb.intValue() > 0;
    }
    public <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
      /* return (T t)-> {
            if(condition.test(t)){
                return ifTrue.apply(t);
            }else{
                return ifFalse.apply(t);
            }
        };  */
    return t -> condition.test(t)? ifTrue.apply(t):ifFalse.apply(t);
    }

}

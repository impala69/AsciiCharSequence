package JavaCoreError;

public class gen {
    public static class Pair<X,Y> {
        private Pair(X x,Y y){
            first=x;
            second=y;
        }
        private X first;
        private Y second;

        public static <X, Y>Pair <X,Y> of(X x,Y y){
            return new Pair<>(x,y);
        }
        public X getFirst(){
            return first;
        }
        public Y getSecond(){
            return second;
        }

        @Override
        public boolean equals(Object o){
            if(this == o)
            {return true;}
            if(!(o instanceof Pair)) return false;

            Pair<?, ?> pair=(Pair<?, ?>) o;

            if(getFirst() != null ? !getFirst().equals(pair.getFirst()) : pair.getFirst() != null) return false;
            return getSecond() != null ? getSecond().equals(pair.getSecond()) : pair.getSecond() == null;
        }

        @Override
        public int hashCode(){
            int result=getFirst() != null ? getFirst().hashCode() : 0;
            result=31 * result+(getSecond() != null ? getSecond().hashCode() : 0);
            return result;
        }
    }

}



package JavaCoreError;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}

public class five_seven {
    public static Animal[] deserializeAnimalArray(byte[] data) throws IllegalArgumentException{
        Animal[] animals=null;
        try {
            ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(data));
            int animalNum=ois.readInt();
            animals=new Animal[animalNum];
            for (int i=0; i<animalNum; i++) {
                animals[i]=(Animal) ois.readObject();
            }
        } catch (ClassCastException | NegativeArraySizeException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassNotFoundException | IOException e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2){
        Set<T> set=new HashSet<>();
        set.addAll(set1);
        Set<T> sets=new HashSet<>();
        sets.addAll(set2);
        set.removeAll(set2);
        sets.removeAll(set1);
        Set<T> set3=set;
        set3.addAll(sets);
        return set3;


    }
}

package JavaCoreError;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class ebanieCollection {
    public static void main(String[] args){
        ArrayDeque<Integer> numbers=new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            sc.nextInt();
            if(sc.hasNext()){
                numbers.addFirst(sc.nextInt());
            }
        }

        StringBuilder sb=new StringBuilder();
        Iterator<Integer> it=numbers.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        System.out.println(sb.toString());
    }
}

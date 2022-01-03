package JavaCoreError;

import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Employ {
    public static Map<String, Long> getSalesMap(Reader reader){
        Map<String, Long> map=new LinkedHashMap<>();
        Scanner sc=new Scanner(reader);
        while (sc.hasNext()){
        String key=sc.next();
        Long value=sc.nextLong();
        map.merge(sc.next(),sc.nextLong(),(aLong, aLong2) -> aLong+aLong2);
        }
            return map;
        }
    }
package JavaCoreError;

public class perfyazadacha {
    public static void main(String[] args){
    }/*
        HashMap<String, Integer> hm=new HashMap<>();
        BufferedReader bf=new BufferedReader(new InputStreamReader (System.in, StandardCharsets.UTF_8));

        InputStreamReader objectStream= bf.lines()
                .flatMap(l -> Stream.of(l.split("[^а-яА-Яa-zA-Z0-9]+"))
                        .map(m -> m.toLowerCase(Locale.ROOT))
                        .forEach(m -> {
                            if(hm.containsKey(m)) hm.put(m, hm.get(m)+1);
                            else hm.put(m, 1);}

                            hm.entrySet()
                                    .stream()
                                    .sorted((e1, e2) -> {
                                        if(e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
                                        else return e2.getValue().compareTo(e1.getValue());
                                    })
                                    .limit(10)
                                    .forEach(e -> System.out.println(e.getKey()))*/
}
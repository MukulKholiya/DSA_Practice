import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Mukul",100);
        map.put("HarshDeep",69+1);
        map.put("Hariom",69-1);
        map.put("Ansh",50);
        map.put("Ankur",80);
        System.out.println(map);
        System.out.println(map.remove("HarshDeep"));
        Integer s = map.get("Mukul");

        System.out.println(s);

        TreeMap<String , Integer> map1 = new TreeMap<>();
        map1.put("Mukul",100);
        map1.put("HarshDeep",900);
        map1.put("Hariom",10);
        map1.put("Ansh",50);
        map1.put("Ankur",80);
        System.out.println(map1);

        LinkedHashMap<String , Integer> map2 = new LinkedHashMap<>();
        map2.put("Mukul",100);
        map2.put("HarshDeep",900);
        map2.put("Hariom",10);
        map2.put("Ansh",50);
        map2.put("Ankur",80);
        System.out.println(map2);

    }

}
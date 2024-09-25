public class HashMapClient {
    public static void main(String[] args) {
        MapImplementation<String , Integer> map = new MapImplementation<>();
        map.put("Mukul",100);
        map.put("hariom",90);
        map.put("ankur",10);
        map.put("ansh",15);
        map.put("paaji",89);
        System.out.println(map.get("ansh"));
        System.out.println(map);
    }
}

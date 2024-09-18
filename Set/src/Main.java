import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.println(set);
        System.out.println(set.contains(5));

        for(Integer i : set){
            System.out.print(i+" ");
        }
        System.out.println();

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(3);
        set1.add(2);
        set1.add(5);
        set1.add(6);
        System.out.println(set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(4);
        set2.add(3);
        set2.add(2);
        set2.add(5);
        set2.add(6);
        System.out.println(set2);



    }
}
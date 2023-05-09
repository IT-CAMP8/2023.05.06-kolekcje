package pl.camp.it.kolekcje.zbiory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        System.out.println(set.size());
        set.add("Janusz");
        set.add("Artur");
        set.add("Zbyszek");
        set.add("Karol");

        System.out.println(set.size());
        System.out.println(set);

        set.add("Karol");
        System.out.println(set);

        for(String s : set) {
            System.out.println(s);
        }

        set.remove("Zbyszek");
        System.out.println(set);

        System.out.println(set.contains("Janusz"));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        HashSet<Integer> set2 = new HashSet<>(list);

        System.out.println(set2);
    }
}

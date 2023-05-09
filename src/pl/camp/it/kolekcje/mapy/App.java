package pl.camp.it.kolekcje.mapy;

import java.util.*;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(5, "Janusz");
        mapa.put(10, "Karol");

        String imie = mapa.get(5);

        System.out.println(imie);
        System.out.println(mapa);

        mapa.putIfAbsent(234, "Wiesiek");
        mapa.putIfAbsent(55, "Wiesiek");
        mapa.putIfAbsent(56, "Wiesiek");
        System.out.println(mapa);

        // mapo daj mi zbior par
        Set<Map.Entry<Integer, String>> entries = mapa.entrySet();
        // iterujemy po tym zbiorze
        // za kazdym razem dostajemy jedno entry (pare) typu Integer, String
        // (bo takiego typu jest nasza mapa)
        for (Map.Entry<Integer, String> entry : entries) {
            // biore to entry (pare) i wyciagam wartosc
            // i sprawdzam czy jest rowna "Wiesiek"
            if(entry.getValue().equals("Wiesiek")) {
                // jeśli wartosc tej pary to wiesiek to wtedy
                // wypisuje klucz z tej pary
                System.out.println(entry.getKey());
            }
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Set<Integer> integers = mapa.keySet();
        Collection<String> values = mapa.values();

        if(values instanceof Set) {
            Set<String> set = (Set<String>) values;
            System.out.println("To jest set !!!");
        } else if (values instanceof List) {
            List<String> list = (List<String>) values;
            list.get(10);
            System.out.println("To jest lista !!!");
        } else if(values instanceof AbstractCollection<String>) {
            System.out.println("To jest abstractCollection !!!");
        }

        for(String value : values) {
            System.out.println(value);
        }

        String s = mapa.get(109);
        System.out.println(s);
    }
}

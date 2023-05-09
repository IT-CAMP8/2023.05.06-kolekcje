package pl.camp.it.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime1 = System.currentTimeMillis();
        for(int i = 0; i < 100000000; i++) {
            arrayList.add(5);
        }
        long endTime1 = System.currentTimeMillis();

        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime2 = System.currentTimeMillis();
        for(int i = 0; i < 100000000; i++) {
            linkedList.add(5);
        }
        long endTime2 = System.currentTimeMillis();

        System.out.println(endTime1 - startTime1);
        System.out.println(endTime2 - startTime2);

        long startTime3 = System.currentTimeMillis();
        arrayList.remove(50000000);
        long endTime3 = System.currentTimeMillis();
        long startTime4 = System.currentTimeMillis();
        linkedList.remove(50000000);
        long endTime4 = System.currentTimeMillis();

        System.out.println(endTime3 - startTime3);
        System.out.println(endTime4 - startTime4);
    }
}

package pl.camp.it.kolekcje.listy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        System.out.println(lista.size());

        Integer x = 5;
        lista.add(x);
        System.out.println(lista.size());

        lista.add(10);
        lista.add(15);
        lista.add(20);
        System.out.println(lista.size());

        //lista.add("sadfasd");
        //lista.add(true);

        //System.out.println(lista.size());

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        lista.remove(3);
        System.out.println(lista.size());

        System.out.println(lista);

        lista.add(0, 100);
        System.out.println(lista);

        lista.add(x);
        lista.add(x);

        System.out.println(lista.contains(10));

        System.out.println(lista);

        Integer[] a = new Integer[10];
        lista.toArray(a);

        ArrayList<Car> lista2 = new ArrayList<>(1000);
        lista2.add(new Car());
        lista2.add(new Car());
        lista2.add(new Car());
        Car[] cars = new Car[0];
        lista2.toArray(cars);

        //lista.trimToSize();

        System.out.println(lista);

        ArrayList<String> lista3 = new ArrayList<>();

        lista3.add("ABC");
        lista3.add("ABC");
        lista3.add("ABC");
        lista3.add("ABC");
        lista3.add("ABC");
        lista3.add("ABC");
        lista3.add("ABC");
        lista3.add("ABC");
        lista3.add("ABC");
        lista3.add("ABC");
        lista3.add("ABC");

        System.out.println("COS");
    }
}

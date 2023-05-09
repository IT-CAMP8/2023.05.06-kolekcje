package pl.camp.it.kolekcje;

import pl.camp.it.kolekcje.listy.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        List<String> list2 = new ArrayList<>();

        metoda1(list);
        metoda2(list);
        metoda3(list);
        metoda4(list);
        metoda1(new Car());
    }

    public static void metoda1(Object lista) {
        if(lista instanceof Collection) {
            List<String> l = (List<String>) lista;
            l.add("ABC");
            int a = l.size();
            l.clear();
        }
        /*lista.add("ABC");
        int a = lista.size();
        lista.clear();*/
    }

    public static void metoda2(List<String> lista) {
        //???
    }

    public static void metoda3(List<String> lista) {
        //???
    }

    public static void metoda4(List<String> lista) {
        //???
    }
}

package pl.camp.it.kolekcje.kolejki;

import java.util.ArrayList;
import java.util.List;

public class LIFO implements CustomQueue {

    private List<Integer> list = new ArrayList<>();

    @Override
    public void push(int x) {
        this.list.add(x);
    }

    @Override
    public Integer pop() {
        if(this.list.isEmpty()) {
            return null;
        }
        int temp = this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return temp;
    }
}

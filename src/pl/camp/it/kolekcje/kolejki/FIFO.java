package pl.camp.it.kolekcje.kolejki;

import java.util.ArrayList;
import java.util.List;

public class FIFO implements CustomQueue {

    private List<Integer> list = new ArrayList<>();

    @Override
    public void push(int x) {
        list.add(x);
    }

    @Override
    public Integer pop() {
        if(this.list.isEmpty()) {
            return null;
        }
        int temp = this.list.get(0);
        this.list.remove(0);
        return temp;
    }
}

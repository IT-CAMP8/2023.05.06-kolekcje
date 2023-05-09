package pl.camp.it.kolekcje.kolejki;

public class App {
    public static void main(String[] args) {
        FIFO fifo = new FIFO();
        fifo.push(5);
        fifo.push(10);

        System.out.println(fifo.pop());

        fifo.push(20);

        System.out.println(fifo.pop());
        System.out.println(fifo.pop());

        System.out.println(fifo.pop());

        System.out.println("--------------------------------");

        LIFO lifo = new LIFO();
        lifo.push(10);
        lifo.push(15);

        System.out.println(lifo.pop());

        lifo.push(20);
        lifo.push(25);

        System.out.println(lifo.pop());
        System.out.println(lifo.pop());
        System.out.println(lifo.pop());
        System.out.println(lifo.pop());
        System.out.println(lifo.pop());
        System.out.println(lifo.pop());
    }
}

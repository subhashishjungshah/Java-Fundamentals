package consumerproducer;

public class Main {
    public static void main(String[] args) {
        Company c1 = new Company();
        Consumer cons1 = new Consumer(c1);
        Producer prod1 = new Producer(c1);
        prod1.start();
        cons1.start();
    }
}

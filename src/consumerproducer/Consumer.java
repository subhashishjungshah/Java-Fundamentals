package consumerproducer;

public class Consumer extends Thread{

    Company c;
    Consumer(Company c){
        this.c = c;
    }
    @Override
    public void run() {
        while (true){
            this.c.consume();
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}

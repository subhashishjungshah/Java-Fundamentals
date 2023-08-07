package consumerproducer;

public class Company {
    int n;
    boolean isProducing = false;

    synchronized public void produce(int n){
        try{
            if(isProducing){
                wait();
            }
            this.n = n;
            System.out.println("Produced: " + this.n);
            isProducing = true;
            notify();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    synchronized public void consume(){
        try{
            if(!isProducing){
                wait();
            }
            System.out.println("Consumed: " + this.n);
            isProducing=false;
            notify();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

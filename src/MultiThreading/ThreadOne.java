package MultiThreading;

public class ThreadOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Task for thread One");
        for (int i = 0; i<10;i++){
            System.out.println("The value of i is " + i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

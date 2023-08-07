package MultiThreading;

public class ThreadTwo extends Thread{
    public void run(){
//        Task for Thread
        for (int i =10; i>=1;i--){
            System.out.println("Another thread i " + i);
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

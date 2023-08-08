package lambda;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable t1 = () -> {
//            This is the body of the thread
            for(int i = 0; i<=10;i++){
                try{
                    System.out.println("The value of i is " + i);
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(t1);
        t.setName("John");
        t.start();
    }
}

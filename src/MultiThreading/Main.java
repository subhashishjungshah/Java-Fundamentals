package MultiThreading;
/*
   *** Multithreading in Java ****
   * Multithreading in Java is process of executing multiple threads simultaneously
   * A thread is a light-weight process
   * One process can do multiple work which is known as multitasking
   * In level of operating system, multitasking refers to running multiple processes
   * Multithreading is running multiple threads in a process

   *** Creating Thread in Java ***
   * Using Runnable -> interface -> run()
   * Using thread -> class
 */

public class Main {


    public static void main(String[] args) {
        /*
        System.out.println("***Hello from Multithreading***");
        ThreadOne thread = new ThreadOne();
        Thread t1 = new Thread(thread);
        t1.start();

        ThreadTwo t2 = new ThreadTwo();
        t2.start();
        */
        System.out.println("Program Started");

        System.out.println(2+3);

        Thread t =  Thread.currentThread();
        String threadName = t.getName();
        System.out.println("Print the current thread is " + threadName);
        t.setName("My main");
        threadName = t.getName();
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(t.getId());
        System.out.println(threadName);


        System.out.println("Program Ended");
    }
}

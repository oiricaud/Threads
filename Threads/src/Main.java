class Thread1 extends Thread {

    @Override
    public void run()
    {
        // Keep the task to be performed here
        for(int i=0; i <= 1000; i++){
            System.out.println("thread 1:" + i);
        }
    }
}

// Defining second thread with task
// The task of this thread is to print the numbers from 1001 to 2000
class Thread2 extends Thread{
    @Override
    public void run(){
        for(int i = 1001; i<= 2000; i++){
            System.out.println("thread 2: " + i);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Thread1 t1= new Thread1();


        // Creating second thread
        Thread2 t2 = new Thread2();
        t2.start();
        t1.start();
    }


}

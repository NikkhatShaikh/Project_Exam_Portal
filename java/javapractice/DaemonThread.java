package javapractice;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println(" Is Daemon Thread");
        }else {
            System.out.println(" User Defined Thread");
        }

    }
}
class DaemonThreadImp{
    public static void main(String[] args) {
        DaemonThread thread1 = new DaemonThread();
        DaemonThread thread2 = new DaemonThread();
        DaemonThread thread3 = new DaemonThread();


        thread1.start();

        thread2.setDaemon(true);
        thread2.start();

        thread3.start();


    }
}
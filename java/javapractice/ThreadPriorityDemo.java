package javapractice;

public class ThreadPriorityDemo implements Runnable{
    @Override
    public void run() {
        System.out.println(" In Running state");
    }
}
class ThreadPriorityImp{
    public static void main(String[] args) {
        ThreadPriorityDemo threadPriorityDemo = new ThreadPriorityDemo();
        Thread thread1= new Thread(threadPriorityDemo);
        Thread thread2 = new Thread(threadPriorityDemo);
        Thread thread3= new Thread(threadPriorityDemo);

        System.out.println("priority of 1 "+thread1.getPriority());
        System.out.println("priority of 2 "+thread2.getPriority());
        System.out.println("priority of 3 "+thread3.getPriority());

        thread1.setPriority(6);
        thread2.setPriority(2);
        thread3.setPriority(9);
        System.out.println("After Setting priority of 1 "+thread1.getPriority());
        System.out.println("After Setting priority of 1 "+thread2.getPriority());
        System.out.println("After Setting priority of 1 "+thread3.getPriority());

        thread1.start();
        thread2.start();
        thread3.start();



    }
}

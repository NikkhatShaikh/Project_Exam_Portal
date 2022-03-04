package javapractice;

public class NamingThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println(" Current Thread "+Thread.currentThread().getName());
        System.out.println(" In Running");
    }
}
class NamingThreadImp{
    public static void main(String[] args) {
        NamingThreadDemo namingThreadDemo1 = new NamingThreadDemo();
        NamingThreadDemo namingThreadDemo2= new NamingThreadDemo();

        System.out.println(namingThreadDemo1.getName());
        System.out.println(namingThreadDemo2.getName());

        namingThreadDemo1.setName("Fonada1");
        namingThreadDemo2.setName("Fonada2");

        namingThreadDemo1.start();
        namingThreadDemo2.start();

        System.out.println(namingThreadDemo1.getName());
        System.out.println(namingThreadDemo2.getName());


    }
}
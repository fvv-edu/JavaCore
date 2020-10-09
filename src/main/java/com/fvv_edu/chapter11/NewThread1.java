package main.java.com.fvv_edu.chapter11;

public class NewThread1 extends Thread {
    NewThread1() {
        super("Демонтрационный поток");
        System.out.println("Дочерний поток: " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i=5; i>0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        new NewThread1();

        try {
            for (int i=5; i>0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}

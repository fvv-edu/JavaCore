package main.java.com.fvv_edu.javacore.chapter09;

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Еще один выриант метода callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}

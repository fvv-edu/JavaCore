package main.java.com.fvv_edu.javacore.chapter09;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}

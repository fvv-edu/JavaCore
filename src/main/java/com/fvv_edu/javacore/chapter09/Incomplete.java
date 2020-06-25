package main.java.com.fvv_edu.javacore.chapter09;

abstract class Incomplete implements  Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}

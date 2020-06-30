package main.java.com.fvv_edu.chapter05;

public class BreakLoop4 {
    public static void main(String[] args) {
        outher: for (int i=0; i<3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j=0; j<100; j++) {
                if (j == 10) break outher;
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет выполняться");
        }
        System.out.println("Циклы завершены.");
    }
}

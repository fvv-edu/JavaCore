package main.java.com.fvv_edu.javacore.chapter09;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }

    static int getDefaultNumber() {
        return 0;
    }
}

class MyIFmp implements MyIF {
    public int getNumber() {
        return 100;
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFmp obj = new MyIFmp();

        System.out.println(obj.getNumber());

        System.out.println(obj.getString());

        int defNum = MyIF.getDefaultNumber();

        System.out.println(defNum);
    }
}
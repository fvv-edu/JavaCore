package main.java.com.fvv_edu.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }
}

class CompDemo {
    public static void main(String[] args) {
        MyComp mc = new MyComp();
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}

class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}

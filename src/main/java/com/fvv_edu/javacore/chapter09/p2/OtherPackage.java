package main.java.com.fvv_edu.javacore.chapter09.p2;

import main.java.com.fvv_edu.javacore.chapter09.p1.Protection;
import main.java.com.nameaccount.javacore.chapter09.p1.*;

public class OtherPackage {

    OtherPackage() {
        Protection p = new Protection();
        System.out.println("конструктор из другого пакета");

        //System.out.println("n = " + p.n);

        //System.out.println("n_pri = " + p.n_pri);

        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}

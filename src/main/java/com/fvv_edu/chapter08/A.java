package main.java.com.fvv_edu.chapter08;

public class A {
    int i, j;
    // private int j;

    A(int a, int b) {
        i = a;
        j = b;
    }

   /* void showij() {
        System.out.println("i и j: " + i + " " + j);
    }
    */

   /* void setij(int x, int y) {
        i = x;
        j = y;
    }
    */

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;
    //int total;
    //int i;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
        //super.i = a;
       // i = b;
    }

    /* void showk() {
        System.out.println("k: " + k);
    }
     */

   /* void sum() {
       // total = i + j;
       // System.out.println("i+j+k: " + (i + j + k));
    }
    */

    void show(String msg) {
        /*System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
        */
       // super.show();
       // System.out.println("k: " + k);
        System.out.println(msg + k);
    }
}

/*class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
 */


/*class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
 */


/* class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k в объекте subOb:");
        subOb.sum();
    }
}
 */

class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("Это k: ");
        subOb.show();
    }
}

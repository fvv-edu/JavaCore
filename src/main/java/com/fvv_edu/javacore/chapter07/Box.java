package main.java.com.fvv_edu.javacore.chapter07;

public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double valume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        vol = mybox1.valume();
        System.out.println("Объем mybox1 равен " + vol);

        vol = mybox2.valume();
        System.out.println("Объем mybox2 равен " + vol);

        vol = mycube.valume();
        System.out.println("Объем mycube равен " + vol);
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.valume();
        System.out.println("Объем mybox1 равен " + vol);

        vol = mybox2.valume();
        System.out.println("Объем mybox2 равен " + vol);

        vol = mycube.valume();
        System.out.println("Объем mycube равен " + vol);

        vol = myclone.valume();
        System.out.println("Объем клона равен " + vol);
    }
}

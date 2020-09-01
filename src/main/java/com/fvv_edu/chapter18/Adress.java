package main.java.com.fvv_edu.chapter18;

import java.util.LinkedList;

public class Adress {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;
    Adress (String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}

class MailList {
    public static void main(String[] args) {
        LinkedList<Adress> m1 = new LinkedList<Adress>();

        m1.add(new Adress("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        m1.add(new Adress("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        m1.add(new Adress("Tom Carlton", "867 Elm St", "Champaing", "IL", "61820"));

        for (Adress element : m1)
            System.out.println(element + "\n");

        System.out.println();
    }
}

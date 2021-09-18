package com.aka;

public class AAAA extends AAA{
    static {
        System.out.println("static AAAA");
    }
    public AAAA() {
        System.out.println("AAAA");
    }

    public static void main(String[] args) {
        new AAAA();
        AAAA aaaa = new AAAA();
        AAAA aaaa1 = new AAAA();
        aaaa1.xx();
        aaaa.xx();

    }

    public static int a = 0;

    public void xx(){
        a++;
        System.out.println(a);
    }
}

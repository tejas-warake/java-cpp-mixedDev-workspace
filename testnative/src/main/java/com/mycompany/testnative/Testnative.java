package com.mycompany.testnative;

public class Testnative {

    public Testnative() {}
//    
    public native double multiply(double a, double b);
    
    public static void main(String[] args) {
        Testnative ob = new Testnative();
        double res = ob.multiply(2.0, 4.0);
        System.out.println(res);
    }
}

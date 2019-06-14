package com.monje;

public class Main {

    public static void main(String[] args) {
            Circulo cir1 = new Circulo(2);
            Circulo cir2 = new Circulo(3);

            cir1.calcularArea();
            cir2.calcularArea();

        System.out.println(cir1.area);
        System.out.println(cir2.area);
    }
}

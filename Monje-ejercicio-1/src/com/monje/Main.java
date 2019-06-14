package com.monje;

public class Main {

    public static void main(String[] args) {
        Producto producto1 = new Producto(1,"cafe oro",100,true);
        Producto producto2 = new Producto(2,"Arroz",50,false);
        Producto producto3 = new Producto(3,"Harina",10,true);

        producto1.calcularImpuesto();
        producto2.calcularImpuesto();
        producto3.calcularImpuesto();

        System.out.println(producto1.impuesto);

        System.out.println(producto2.impuesto);

        System.out.println(producto3.impuesto);

    }

}

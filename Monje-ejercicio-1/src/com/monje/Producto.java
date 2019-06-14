package com.monje;

public class Producto {

        public int codigo;
        public String descripcion;
        public double precio;
        public boolean gravado;
        public double impuesto;


    public Producto(int codigo, String descripcion, double precio, boolean gravado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.gravado = gravado;
    }

    public double calcularImpuesto(){
        if (gravado == true) {
            return(impuesto= precio*0.15);
        }
             return 0;
    }
}



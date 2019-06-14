package com.monje;

public class Circulo {
    public double radio;
    public double area;
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return (area = 3.14*(radio*radio));
    }
}

package com.treino5;

public class TrianguloEquilatero {

    private double lado, perimetro, area;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
        calcArea();
        ;
        calcPerimetro();
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void calcArea() {
        this.area = (lado * Math.sqrt(3)) / 2;
    }

    public void calcPerimetro() {
        this.perimetro = 3 * lado;
    }
}

package com.treino3;

public class Complexo {
    double a, b;

    public Complexo(double a, double b) {
        this.a = a; // parte real
        this.b = b; // parte imaginaria
    }

    public Complexo soma(Complexo outro) {
        double real = this.a + outro.a;
        double imaginario = this.b + outro.b;
        return new Complexo(real, imaginario);
    }

    public Complexo multiplica(Complexo outro) {
        double real = (this.a * outro.a) - (this.b * outro.b);
        double imaginario = (this.a * outro.b) + (this.b * outro.a);
        return new Complexo(real, imaginario);
    }

    public String toString() {
        return this.a + " + " + this.b + "i";
    }

    public double modulo() {
        return Math.sqrt((this.a * this.a) + (this.b * this.b));
    }

    public double argumentoPrincipal() {
        return Math.atan2(this.b, this.a);
    }
}

package com.treino11;

public class Apartamento {

    private int numIdentificador;

    public Apartamento(int numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public int getNumIdentificador() {
        return numIdentificador;
    }

    public String toString() {
        return "Apartamento nº " + numIdentificador;
    }

}

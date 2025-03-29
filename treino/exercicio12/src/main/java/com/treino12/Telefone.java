package com.treino12;

public class Telefone {

    private String ddd, numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDDD() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

}

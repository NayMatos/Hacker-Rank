package com.treino9;

public class Cliente {
    private String nome;
    private double saldo, limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public boolean sacar(double quantia) {

        if (saldo + limite >= quantia) {
            saldo = saldo - quantia;
            System.out.println("Saque de R$ " + quantia + " Aprovado.");
            return true; // saque aprovado
        } else {
            System.out.println("Saque de R$ " + quantia + " Reprovado.");
            return false; // saque reprovado
        }
    }

    public double depositar(double quantia) {
        saldo = saldo + quantia;
        System.out.println("Depósito de R$ " + quantia + " realizado.");
        return saldo;
    }

    public double checarSaldo() {
        return saldo + limite;
    }

    public String obterNome() {
        return nome;
    }
}

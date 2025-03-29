package com.treino1;

public class Pessoa {
    private String nome;
    private Sexo sexo;
    private int idade;
    private boolean vegetariana;

    // Construtor
    public Pessoa(String nome, Sexo sexo, int idade, boolean vegetariana) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.vegetariana = vegetariana;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isVegetariana() {
        return vegetariana;
    }

}

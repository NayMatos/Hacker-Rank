package com.treino12;

public class Cliente {
    private String nome, cpf;
    private Telefone telefone;

    public Cliente(String nome, String cpf, Telefone telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: (" + telefone.getDDD() + ") " + telefone.getNumero());
    }

    public void adicionarTelefone(Telefone novoTelefone) {
        this.telefone = novoTelefone;
    }
}

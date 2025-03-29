package com.treino12;

/*Exercício 12. Implemente a classe Cliente que contenha os atributos: nome,
cpf (Strings) e telefone (Telefone). E que contenha os métodos: mostrarDados()
e adicionarTelefone() o primeiro deve mostrar todos os dados do cliente incluindo
o telefone e o último deve associar um novo telefone ao cliente. Implemente a
classe Telefone que possua os atributos: ddd e número (Strings) e os métodos:
obterNumero() e obterDDD(). */

public class Main {
    public static void main(String[] args) {

        Telefone telefone = new Telefone("11", "987654321");

        Cliente cliente = new Cliente("João Silva", "123.456.789-00", telefone);

        cliente.mostrarDados();

        Telefone novoTelefone = new Telefone("21", "912345678");

        cliente.adicionarTelefone(novoTelefone);

        System.out.println("\nApós atualizar o telefone:");
        cliente.mostrarDados();
    }
}
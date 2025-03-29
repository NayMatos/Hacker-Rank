package com.treino11;

/*Exercício 11. Usando o exercício anterior, implemente a classe Edificio que
possui vários apartamentos. Suponhamos, por simplicidade, que cada edifício
possui apenas 3 apartamentos. Crie uma classe Apartamento que possui um
número identificador. A classe Edificio deve ser capaz de adicionar apartamentos,
listar todos os apartamentos e buscar um apartamento pelo seu identificador. */

public class Main {
    public static void main(String[] args) {

        Edificio meuEdificio = new Edificio();

        Apartamento apt1 = new Apartamento(101);
        Apartamento apt2 = new Apartamento(102);
        Apartamento apt3 = new Apartamento(103);

        meuEdificio.adicionarApartamento(apt1);
        meuEdificio.adicionarApartamento(apt2);
        meuEdificio.adicionarApartamento(apt3);

        System.out.println("Listando todos os apartamentos:");
        meuEdificio.listarApartamentos();

        int numBuscado = 102;
        Apartamento apartamentoBuscado = meuEdificio.buscarApartamentoPorId(numBuscado);
        if (apartamentoBuscado != null) {
            System.out.println("Apartamento encontrado: " + apartamentoBuscado);
        } else {
            System.out.println("Apartamento com N° " + numBuscado + " não encontrado.");
        }
    }
}

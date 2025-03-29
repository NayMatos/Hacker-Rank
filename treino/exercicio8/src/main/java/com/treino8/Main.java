package com.treino8;

/*Exercício 8. Implemente a classe Porta que possua: Atributos: isOpen(boolean),
numAberturas(int); Métodos: abrir(): abre a porta e conta 1 na contagem de
aberturas; fechar(): fecha a porta. OBS: O atributo numAberturas deve contar
o total de aberturas de todas as portas possíveis. */

public class Main {
    public static void main(String[] args) {

        Porta porta1 = new Porta(false); // Porta inicialmente fechada
        Porta porta2 = new Porta(true); // Porta inicialmente aberta

        porta1.abrir();

        System.out.println("Número de aberturas: " + Porta.getNumAberturas());

        porta2.fechar();

        System.out.println("A porta 1 está aberta? " + porta1.isOpen());
        System.out.println("A porta 2 está aberta? " + porta2.isOpen());

        porta2.abrir();

        System.out.println("Número de aberturas após nova abertura: " + Porta.getNumAberturas());

        System.out.println("A porta 1 está aberta? " + porta1.isOpen());
        System.out.println("A porta 2 está aberta? " + porta2.isOpen());

    }
}

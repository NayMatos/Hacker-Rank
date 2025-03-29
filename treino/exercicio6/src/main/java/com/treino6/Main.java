package com.treino6;

/*Exercício 6. Implemente uma classe que modele um jogo de adivinhaçãoo de
números de 0 a 99. Atributos: um número inteiro sorteado. Métodos: sortear(),
advinhar(). OBS: O objeto para gerar números aleatórios no Java é o Random;
você deve instanciá-lo e chamar seu método nextInt() que deve possuir um
argumento inteiro, no caso aqui, 100. */

public class Main {
    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        jogo.sortear();

        jogo.advinhar(50);
        jogo.advinhar(75);
        jogo.advinhar(90);
        jogo.advinhar(44);
    }
}
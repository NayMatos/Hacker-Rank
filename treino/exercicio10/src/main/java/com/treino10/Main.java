package com.treino10;

/*Exercício 10. Usando o exercício 8, faça uma classe Casa com que represente
uma casa. A casa tem uma cor, uma porta de entrada e pode ter até três portas
(considere que todas as portas podem ser abertas ou fechadas independentemente).
Implemente os métodos para abrir e fechar as portas, e um método que
retorne quantas portas estão abertas. */

public class Main {
    public static void main(String[] args) {
        Porta p1 = new Porta(false);
        Porta p2 = new Porta(true);
        Porta p3 = new Porta(false);

        Casa minhaCasa = new Casa("Azul", p1, p2, p3);
        System.out.println("A cor da casa é: " + minhaCasa.getCor());

        p1.abrir();
        System.out.println("Portas abertas após abrir a porta 1: " + minhaCasa.contarPortasAbertas());

        p2.fechar();
        System.out.println("Portas abertas após fechar a porta 2: " + minhaCasa.contarPortasAbertas());
    }
}
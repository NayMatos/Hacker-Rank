package com.treino7;

/*Exercício 7. Implemente a classe Eq2Grau que possua: Atributos: a, b e
c (doubles); Métodos: delta(): retorna o delta da equação; raiz1(): retorna a
primeira raiz se Δ ≥ 0, se não, retorna NaN; raiz2(): retorna a segunda raiz se
Δ ≥ 0, se não, retorna NaN. */

public class Main {
    public static void main(String[] args) {

        Eq2Grau equacao = new Eq2Grau(1, -3, 2); // Exemplo: x² - 3x + 2 = 0

        System.out.println("Delta: " + equacao.delta());

        double raiz1 = equacao.raiz1();
        double raiz2 = equacao.raiz2();

        if (!Double.isNaN(raiz1)) {
            System.out.println("Primeira raiz: " + raiz1);
        } else {
            System.out.println("Primeira raiz: Não existe raiz real.");
        }

        if (!Double.isNaN(raiz2)) {
            System.out.println("Segunda raiz: " + raiz2);
        } else {
            System.out.println("Segunda raiz: Não existe raiz real.");
        }
    }
}
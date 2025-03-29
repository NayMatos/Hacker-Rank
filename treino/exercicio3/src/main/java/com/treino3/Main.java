package com.treino3;

/* Exercício 3. Implemente uma classe chamada Complexo para representar números imaginários. A classe deve possuir:
Atributos:
    Dois valores do tipo double:
        a (Parte real)
        b (Parte imaginária)
Métodos:
    Construtor
    soma(): Recebe como parâmetro outro número complexo (objeto desta classe) e realiza a soma, ou seja, a parte real será somada com a parte real e a parte imaginária com a parte imaginária.
    multiplica(): Recebe como parâmetro outro número complexo (objeto desta classe) e realiza a multiplicação utilizando a fórmula:
        (a+bi)⋅(c+di)=(ac−bd)+(ad+bc)i
    toString(): Retorna uma string exibindo os atributos a e b na notação complexa: 
        a+bi.
    modulo(): Retorna o módulo do número complexo, dado pela fórmula:
        ​raiz quadrada (a^2 + b^2) 
    argumentoPrincipal(): Retorna o ângulo formado pelo número complexo no plano de Argand-Gauss, calculado pela fórmula:
        θ = tan^−1*(a/b)
*/

public class Main {
    public static void main(String[] args) {
        Complexo num1 = new Complexo(3, 4);
        Complexo num2 = new Complexo(1, 2);

        Complexo soma = num1.soma(num2);
        Complexo multiplicacao = num1.multiplica(num2);

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Módulo de num1: " + num1.modulo());
        System.out.println("Argumento Principal de num1: " + num1.argumentoPrincipal());
    }
}
package com.treino5;

/*Exercício 5. Implemente uma classe que modele um triângulo equilátero (lados iguais). 
Atributos: lado, perímetro, área. Métodos: calcArea(), calcPerímetro e seus gets. 
O lado deverá ser o único atributo inicializado via construtor. 
Fórmulas: Área = lado×√ 3/2 , Perímetro = 3 × lado. */

public class Main {
    public static void main(String[] args) {

        TrianguloEquilatero triangulo1 = new TrianguloEquilatero(5);

        System.out.println("Lado do Triângulo: " + triangulo1.getLado());
        System.out.println("Área do Triângulo: " + triangulo1.getArea());
        System.out.println("Perímetro do Triângulo: " + triangulo1.getPerimetro());
    }
}
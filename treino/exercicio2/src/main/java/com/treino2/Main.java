package com.treino2;

/*Exercício 2. Implemente uma classe Lâmpada com os seguintes componentes
e faça um teste ao final: Atributos: estado(Enum) Métodos:
• click(): ao chamar este método a lâmpada é colocada no estado ”apagada”
caso esteja ”acesa” e é colocado no estado ”acesa” caso esteja ”apagada”.
• qtdAcendimentos(): retorna quantas vezes a lâmpada foi acesa (DICA:
este método deve ser chamada no método acima).
• checaEstado(): retorna o estado atual da Lâmpada. */

public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        System.out.println("Estado inicial: " + lampada.checaEstado());

        lampada.click(); // Deve acender a lâmpada
        System.out.println("Estado após 1º click: " + lampada.checaEstado());
        System.out.println("Acendimentos: " + lampada.getAcendimentos());

        lampada.click(); // Deve apagar a lâmpada
        System.out.println("Estado após 2º click: " + lampada.checaEstado());
        System.out.println("Acendimentos: " + lampada.getAcendimentos());

        lampada.click(); // Deve acender a lâmpada novamente
        System.out.println("Estado após 3º click: " + lampada.checaEstado());
        System.out.println("Acendimentos: " + lampada.getAcendimentos());
    }
}
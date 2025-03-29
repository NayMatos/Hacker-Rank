package com.treino6;

import java.util.Random;

public class JogoAdivinhacao {

    private int numeroSorteado;

    public void sortear() {
        Random random = new Random();
        numeroSorteado = random.nextInt(100); // Sorteia um número de 0 a 99, sempre será um numero menor que 100
        System.out.println("Número sorteado (oculto): " + numeroSorteado);
    }

    public boolean advinhar(int palpite) {
        if (palpite == numeroSorteado) {
            System.out.println("Parabéns! Você acertou!");
            return true;
        } else if (palpite < numeroSorteado) {
            System.out.println("O número sorteado é maior. Tente novamente.");
        } else {
            System.out.println("O número sorteado é menor. Tente novamente.");
        }
        return false;
    }
}

package com.treino2;

public class Lampada {
    private Estado estado;
    private int acendimentos;

    public Lampada() {
        this.estado = Estado.APAGADA; // A lâmpada começa apagada
        this.acendimentos = 0; // Inicialmente, a lâmpada não foi acesa
    }

    public void click() {
        // Se a lâmpada está acesa, apagá-la, caso contrário, acendê-la
        if (estado == Estado.ACESA) {
            estado = Estado.APAGADA; // Apaga a lâmpada
        } else {
            estado = Estado.ACESA; // Acende a lâmpada
            qtdAcendimentos(); // Contabiliza o acendimento
        }
    }

    public void qtdAcendimentos() {
        if (estado == Estado.ACESA) {
            acendimentos++; // Incrementa a quantidade de acendimentos
        }
    }

    public Estado checaEstado() {
        return estado; // Retorna o estado atual da lâmpada
    }

    public int getAcendimentos() {
        return acendimentos; // Retorna o número total de acendimentos
    }
}

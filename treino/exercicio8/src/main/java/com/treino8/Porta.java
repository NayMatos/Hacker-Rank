package com.treino8;

public class Porta {

    private boolean isOpen;
    private static int numAberturas = 0;

    public Porta(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public static int getNumAberturas() {
        return numAberturas;
    }

    public void abrir() {
        if (!isOpen) {
            isOpen = true;
            numAberturas++;
        }
    }

    public void fechar() {
        if (isOpen) {
            isOpen = false;
        }

    }

}

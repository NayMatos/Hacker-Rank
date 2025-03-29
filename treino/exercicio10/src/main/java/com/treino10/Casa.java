package com.treino10;

public class Casa {

    private String cor;
    private Porta porta1, porta2, porta3;
    
    public Casa(String cor, Porta porta1, Porta porta2, Porta porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public String getCor() {
        return cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public int contarPortasAbertas() {
        int count = 0;
        if (porta1 != null && porta1.isOpen()) count++;
        if (porta2 != null && porta2.isOpen()) count++;
        if (porta3 != null && porta3.isOpen()) count++;
        return count;
    }

}

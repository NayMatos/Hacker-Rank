package com.treino1;

public class Churrasco {
    double qtdCarne;

    public void verificarConsumo(Pessoa pessoa) {
        if (pessoa.getIdade() >= 0 && pessoa.getIdade() <= 3 || pessoa.isVegetariana()) {
            qtdCarne += 0;
        } else if (pessoa.getIdade() >= 4 && pessoa.getIdade() <= 12) {
            qtdCarne += 1;
        } else {
            qtdCarne += 2;
        }
    }

    public double getQtdCarne() {
        return qtdCarne;
    }
}

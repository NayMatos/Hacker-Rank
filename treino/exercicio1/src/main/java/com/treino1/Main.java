package com.treino1;

/*Exercício 1. Dada a classe Pessoa que possui os atributos: String nome,
String sexo, int idade, boolean vegetariana. Faça agora uma classe Churrasco
que possua: Atributos: qtdCarne(double); Método: verificarConsumo():
Recebe via parâmetro uma Pessoa e com isto define a consumação média de
carne (quantidade de carne consumida) pessoas de 0 a 3 anos não consomem,
vegetarianos também não. Pessoas de 4 a 12 anos consomem 1 kilo de carne e
de 13 anos em diante 2 kilos de carne.*/

public class Main {
    /*
     * public static void main(String[] args) {
     * Pessoa pessoa1 = new Pessoa();
     * pessoa1.nome = "Elisa";
     * pessoa1.sexo = Sexo.F;
     * pessoa1.idade = 3;
     * pessoa1.vegetariana = false;
     * 
     * Pessoa pessoa2 = new Pessoa();
     * pessoa2.nome = "Jéssica";
     * pessoa2.sexo = Sexo.F;
     * pessoa2.idade = 23;
     * pessoa2.vegetariana = true;
     * 
     * Pessoa pessoa3 = new Pessoa();
     * pessoa3.nome = "Heitor";
     * pessoa3.sexo = Sexo.M;
     * pessoa3.idade = 12;
     * pessoa3.vegetariana = false;
     * 
     * Pessoa pessoa4 = new Pessoa();
     * pessoa4.nome = "Olívia";
     * pessoa4.sexo = Sexo.F;
     * pessoa4.idade = 13;
     * pessoa4.vegetariana = false;
     */

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Elisa", Sexo.F, 3, false);
        Pessoa pessoa2 = new Pessoa("Jéssica", Sexo.F, 23, true);
        Pessoa pessoa3 = new Pessoa("Heitor", Sexo.M, 12, false);
        Pessoa pessoa4 = new Pessoa("Olívia", Sexo.F, 13, false);

        Churrasco churrasco = new Churrasco();
        churrasco.verificarConsumo(pessoa1);
        churrasco.verificarConsumo(pessoa2);
        churrasco.verificarConsumo(pessoa3);
        churrasco.verificarConsumo(pessoa4);

        System.out.println(churrasco.getQtdCarne());
    }
}
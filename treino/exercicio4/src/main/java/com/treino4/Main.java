package com.treino4;

/*Exercício 4. Implemente a classe Cliente que possua os atributos nome,
saldo, e limite. Esta deve possuir também os métodos sacar(), depositar(),
checarSaldo(), e obterNome(). Sabe-se que só é possível sacar se o saldo+limite
forem superiores à quantia. Os métodos sacar() e depositar() necessitam de
parâmetros. O método checarSaldo deve retornar o valor saldo+limite. O
método obterNome() deve retornar o nome do Cliente.
 */

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Nayara Matos", 500000, 1500000);

        System.out.println("Nome do Cliente: " + cliente1.obterNome());
        System.out.println("Saldo + Limite: " + cliente1.checarSaldo());

        cliente1.sacar(10000); // Saque aprovado, mensagem no método sacar();
        cliente1.sacar(3000000);// Saque reprovado, mensagem no método sacar();

        cliente1.depositar(20000);
        System.out.println("Saldo atualizado: R$ " + cliente1.checarSaldo());
    }
}
package com.treino9;

/*Exercício 9. Usando o Exercício 4, implemente a classe Transferencia que
possuí o método transferir() que recebe via parâmetro dois Clientes c1 e c2
(ver exercício acima) e a quantia (necessita uma verificação de saldo). Deve ser
tirado da conta de c2 e colocado na conta de c1. Exiba também uma mensagem
de conclusão de transferência explicitando os nomes dos envolvidos. */

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Nayara Matos", 500000, 1500000);
        Cliente cliente2 = new Cliente("João Silva", 300000, 500000);

        System.out.println("Nome do Cliente 1: " + cliente1.obterNome());
        System.out.println("Saldo + Limite Cliente 1: " + cliente1.checarSaldo());

        System.out.println("Nome do Cliente 2: " + cliente2.obterNome());
        System.out.println("Saldo + Limite Cliente 2: " + cliente2.checarSaldo());

        Transferencia.transferir(cliente1, cliente2, 200000); // Teste da transferência

        System.out.println("Saldo atualizado Cliente 1: R$ " + cliente1.checarSaldo());
        System.out.println("Saldo atualizado Cliente 2: R$ " + cliente2.checarSaldo());
    }
}
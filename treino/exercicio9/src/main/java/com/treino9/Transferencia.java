package com.treino9;

public class Transferencia {
    public static void transferir(Cliente c1, Cliente c2, double quantia) {
        if (c2.sacar(quantia)) { // Se o saque for bem-sucedido (true)
            c1.depositar(quantia); // Deposita o valor em c1
            System.out.println(
                    "Transferência de R$ " + quantia + " concluída de " + c2.getNome() + " para " + c1.getNome());
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente em " + c2.getNome());
        }
    }
}
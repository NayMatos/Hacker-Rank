package com.hackerrank;

//Java Datatypes

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                // Lê o número fornecido (long)
                long x = sc.nextLong();

                // Imprime a primeira linha com o número
                System.out.println(x + " can be fitted in:");

                // Verificação para 'byte'
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                // Verificação para 'short'
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                // Verificação para 'int'
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }
                // Verificação para 'long'
                if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                /*Se o número não pode ser lido ou for fora dos limites dos tipos mencionados,
                imprime que não pode ser armazenado*/
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}

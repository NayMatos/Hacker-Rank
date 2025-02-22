package com.hackerrank;

//Java End-of-file

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1; // Representa o número da linha que estamos lendo e imprimindo
                            // Começa numerando a partir de 1

        while (scanner.hasNext()) { // Continua lendo até EOF
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line); // Imprime número da linha + conteúdo
            lineNumber++; // Aumenta o número da linha
        }

        scanner.close();
    }
}
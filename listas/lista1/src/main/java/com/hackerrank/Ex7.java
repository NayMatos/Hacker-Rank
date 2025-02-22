package com.hackerrank;

//Java Loops II

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Número de consultas

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b; // 2^j * b
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        in.close();
    }
}

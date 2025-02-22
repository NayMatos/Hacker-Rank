package com.hackerrank;

//Java Int to String

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String s = Integer.toString(n);

        if (s.equals(String.valueOf(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

    }
}

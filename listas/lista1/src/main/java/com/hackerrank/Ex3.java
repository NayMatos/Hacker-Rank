package com.hackerrank;

//Java If-Else

import java.util.Scanner;

public class Ex3 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      scanner.close();

      if (N % 2 != 0) { // Se o número for ímpar
         System.out.println("Weird");
      } else if (N >= 2 && N <= 5) { // Se for par e estiver entre 2 e 5
         System.out.println("Not Weird");
      } else if (N >= 6 && N <= 20) { // Se for par e estiver entre 6 e 20
         System.out.println("Weird");
      } else { // Se for par e maior que 20
         System.out.println("Not Weird");
      }
   }
}

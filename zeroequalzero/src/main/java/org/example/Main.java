package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Lendo os valores de M e N
            int M = scanner.nextInt();
            int N = scanner.nextInt();

            // Condição de término do programa
            if (M == 0 && N == 0) {
                break;
            }

            // Calcula a soma dos dois números
            int soma = M + N;

            // Remove os zeros do resultado da soma
            String somaSemZeros = String.valueOf(soma).replace("0", "");

            // Imprime o resultado sem zeros
            System.out.println(somaSemZeros);
        }

        scanner.close();
    }
}

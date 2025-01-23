package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de casos de teste
        int casosDeTeste = scanner.nextInt();

        // Processa cada caso de teste
        for (int i = 0; i < casosDeTeste; i++) {
            // Lê os valores de início (B) e fim (E)
            int inicio = scanner.nextInt();
            int fim = scanner.nextInt();

            StringBuilder crescente = new StringBuilder();

            // Gera a sequência crescente
            for (int j = inicio; j <= fim; j++) {
                crescente.append(j);
            }

            // Gera a sequência espelhada invertendo a crescente
            String espelhada = crescente.toString() + crescente.reverse();

            // Imprime a sequência espelho
            System.out.println(espelhada);
        }

        scanner.close();
    }
}

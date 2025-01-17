package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Processar todas as entradas até EOF
        while (scanner.hasNextInt()) {
            int height = scanner.nextInt();

            // Gerar a árvore de Natal
            for (int i = 1; i <= height; i++) {
                // Imprime os espaços antes das estrelas
                for (int space = 1; space <= height - i; space++) {
                    System.out.print(" ");
                }

                // Imprime as estrelas
                for (int star = 1; star <= i * 2 - 1; star++) {
                    System.out.print("*");
                }

                // Próxima linha
                System.out.println();
            }

            // Imprime o tronco da árvore (uma linha)
            for (int space = 1; space <= height - 1; space++) {
                System.out.print(" ");
            }
            System.out.println("*");

            // Linha em branco entre árvores
            if (scanner.hasNextInt()) {
                System.out.println();
            }
        }

        scanner.close();
    }
}

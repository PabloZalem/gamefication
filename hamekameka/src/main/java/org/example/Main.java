package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de casos de teste
        int C = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após o número

        // Processa cada caso de teste
        for (int i = 0; i < C; i++) {
            String inicioAtaque = scanner.nextLine();
            StringBuilder finalizacao = new StringBuilder("ka");

            // Conta o número de 'a' no início do ataque
            long numAs = inicioAtaque.chars().filter(ch -> ch == 'a').count();

            // Adiciona o número correto de 'a' na finalização
            for (int j = 0; j < numAs; j++) {
                finalizacao.insert(1, 'a');
            }

            // Exibe a finalização
            System.out.println(finalizacao);
        }

        scanner.close();
    }
}

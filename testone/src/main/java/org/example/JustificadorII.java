package org.example;

import java.util.Scanner;

public class JustificadorII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Lê o número de casos
            int casos = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (casos == 0) {
                break;
            }

            String[] palavras = new String[casos];
            String[] textoSaida = new String[casos];

            // Lê as entradas
            for (int i = 0; i < casos; i++) {
                palavras[i] = scanner.nextLine();
            }

            // Remove espaços extras e monta o texto de saída
            for (int i = 0; i < casos; i++) {
                StringBuilder sb = new StringBuilder();
                String[] partes = palavras[i].trim().split("\\s+");

                for (int j = 0; j < partes.length; j++) {
                    sb.append(partes[j]);
                    if (j < partes.length - 1) {
                        sb.append(" ");
                    }
                }

                textoSaida[i] = sb.toString();
            }

            // Encontra o tamanho da maior string
            int maior = 0;
            for (String texto : textoSaida) {
                if (texto.length() > maior) {
                    maior = texto.length();
                }
            }

            // Imprime as strings justificadas à direita
            for (String texto : textoSaida) {
                System.out.printf("%" + maior + "s\n", texto);
            }

            // Imprime uma linha em branco se houver mais entradas
            if (scanner.hasNextInt() && scanner.nextInt() != 0) {
                System.out.println();
                scanner.nextLine(); // Limpa o buffer
            } else {
                break;
            }
        }

        scanner.close();
    }
}


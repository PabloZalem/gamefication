package org.example;

import java.util.Scanner;

public class JustificadorII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int casos = scanner.nextInt();
            scanner.nextLine();

            String[] palavras = new String[casos];
            String[] textoSaida = new String[casos];

            for (int i = 0; i < casos; i++) {
                palavras[i] = scanner.nextLine();
            }

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

            int maior = 0;
            for (String texto : textoSaida) {
                if (texto.length() > maior) {
                    maior = texto.length();
                }
            }

            for (String texto : textoSaida) {
                System.out.printf("%" + maior + "s\n", texto);
            }

            if (scanner.hasNextInt() && scanner.nextInt() != 0) {
                System.out.println();
                scanner.nextLine();
            } else {
                break;
            }
        }
        scanner.close();
    }
}
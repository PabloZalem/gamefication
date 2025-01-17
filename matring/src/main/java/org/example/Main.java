package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a matriz 4x(N+2)
        int[][] matring = new int[4][];
        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine().trim();
            int[] column = new int[line.length()];
            for (int j = 0; j < line.length(); j++) {
                column[j] = Character.getNumericValue(line.charAt(j));
            }
            matring[i] = column;
        }

        // Determina o número de colunas (N+2)
        int numColumns = matring[0].length;

        // Extrai os números F e L
        int F = getColumnNumber(matring, 0);       // Primeira coluna
        int L = getColumnNumber(matring, numColumns - 1); // Última coluna

        // Decodifica a mensagem
        StringBuilder decodedMessage = new StringBuilder();
        for (int col = 1; col < numColumns - 1; col++) {
            int Mi = getColumnNumber(matring, col);
            int Ci = (F * Mi + L) % 257; // Fórmula de decodificação
            decodedMessage.append((char) Ci);
        }

        // Exibe a mensagem decodificada
        System.out.println(decodedMessage);

        scanner.close();
    }

    // Função para converter uma coluna em um número de 4 dígitos
    private static int getColumnNumber(int[][] matring, int columnIndex) {
        int number = 0;
        for (int i = 0; i < 4; i++) {
            number = number * 10 + matring[i][columnIndex];
        }
        return number;
    }
}

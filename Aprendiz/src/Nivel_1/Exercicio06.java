package Nivel_1;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Imprimir todos os índices (i, j) de uma matriz 3x3.");

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Índice (" + i + "," + j + ") ");
            }
        }


    }
}

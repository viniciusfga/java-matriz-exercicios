package Nivel_5;

import java.util.Scanner;


/**
 * Exercício 14 - Nível 5
 * Objetivo: Substituir todos os elementos negativos por zero.
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int[][] matriz = {
                {-1, 2, 3},
                {4, -5, 6},
                {7, 8, -9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }


    }
}

package Nivel_1;

import java.util.Scanner;


/**
 * Exercício 05 - Nível 1
 * Objetivo: Ler uma matriz 2x3 do teclado com Scanner.
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int[][] matriz = new int[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }



    }
}

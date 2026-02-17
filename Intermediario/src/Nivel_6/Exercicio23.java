package Nivel_6;

import java.util.Arrays;


/**
 * Exercício 23 - Nível 6
 * Objetivo: Ordenar todos os elementos de uma matriz em ordem crescente.
 */
public class Exercicio23 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[] vetor = new int[matriz.length *  matriz[0].length];

        int k = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                vetor[k++] = matriz[i][j];
            }
        }

        Arrays.sort(vetor);

        /*
        Ou ordenar o vetor manualmente (Bubble Sort)
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
         */

        k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = vetor[k++];
            }
        }

        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}

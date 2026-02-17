package Nivel_2;


/**
 * Exercício 19 - Nível 2
 * Objetivo: Imprimir todos os elementos múltiplos de 3 de uma matriz 4x4.
 */
public class Exercicio19 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {4, 3, 2, 6},
                {2, 1, 0, 9},
                {2, 1, 0, 9},
                {2, 1, 0, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 3 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

    }
}

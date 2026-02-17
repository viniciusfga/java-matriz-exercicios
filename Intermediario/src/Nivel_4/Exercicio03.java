package Nivel_4;


/**
 * Exercício 03 - Nível 4
 * Objetivo: Exibir todos os elementos de uma matriz 4x4.
 */
public class Exercicio03 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]  );
            }
            System.out.println();
        }

    }
}

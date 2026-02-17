package Nivel_2;


/**
 * Exercício 15 - Nível 2
 * Objetivo: Imprimir somente os elementos da primeira linha de uma matriz.
 */
public class Exercicio15 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {4, 3, 2},
                {2, 1, 0}
        };

        for (int i = 0; i < matriz[0].length; i++) {
                System.out.print(matriz[0][i] + " ");
        }

    }
}

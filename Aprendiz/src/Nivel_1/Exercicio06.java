package Nivel_1;


/**
 * Exercício 06 - Nível 1
 * Objetivo: Imprimir todos os índices (i, j) de uma matriz 3x3.
 */
public class Exercicio06 {
    public static void main(String[] args) {

        

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Índice (" + i + "," + j + ") ");
            }
        }

    }
}

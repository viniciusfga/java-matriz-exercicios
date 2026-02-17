package Nivel_1;


/**
 * Exercício 04 - Nível 1
 * Objetivo: Imprimir a matriz com os elementos separados por |.
 */
public class Exercicio04 {
    public static void main(String[] args) {

        

        // Exemplo criando uma matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Imprimindo os elementos com separador |
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);

                // Adiciona " | " se não for o último elemento da linha
                if (j < matriz[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }

    }
}

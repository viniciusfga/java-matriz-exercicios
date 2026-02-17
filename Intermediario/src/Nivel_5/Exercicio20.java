package Nivel_5;


/**
 * Exercício 20 - Nível 5
 * Objetivo: Verificar se uma matriz 3x3 é um quadrado mágico.
 */
public class Exercicio20 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        };

        boolean linhas = false;
        boolean colunas = false;
        boolean diagonais = false;

        //LINHAS
        int[] somaLinhas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinhas[i] += matriz[i][j];
            }
        }
        if (somaLinhas[0] == somaLinhas[1] && somaLinhas[0] == somaLinhas[2]) {
            linhas = true;
        }
        //COLUNAS
        int[] somaColunas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaColunas[i] += matriz[j][i];
            }
        }
        if (somaColunas[0] == somaColunas[1] && somaColunas[0] == somaColunas[2]) {
            colunas = true;
        }
        //DIAGONAIS
        int[] somaDiagonais = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    somaDiagonais[0] += matriz[i][j];
                }
                if (i + j == 2) {
                    somaDiagonais[1] += matriz[i][j];
                }
            }
        }
        if (somaDiagonais[0] == somaDiagonais[1]) {
            diagonais = true;
        }

        int somaReferencia = somaLinhas[0];
        if (linhas && colunas && diagonais &&
                somaReferencia == somaColunas[0] &&
                somaReferencia == somaDiagonais[0]) {
            
        } else {
            
        }
    }
}

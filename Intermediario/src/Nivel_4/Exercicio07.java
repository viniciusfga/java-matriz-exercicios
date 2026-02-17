package Nivel_4;


/**
 * Exercício 07 - Nível 4
 * Objetivo: Somar todos os elementos de uma matriz.
 */
public class Exercicio07 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 1, 1}
        };

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.print(soma);

    }
}

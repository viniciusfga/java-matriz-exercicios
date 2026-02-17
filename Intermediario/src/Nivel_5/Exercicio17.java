package Nivel_5;


/**
 * Exercício 17 - Nível 5
 * Objetivo: Somar os elementos de cada linha e exibir a soma.
 */
public class Exercicio17 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {1, 2, 1},
                {1, 1, 2},
                {2, 1, 1}
        };

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            System.out.println("Linha " + i + " = "+ soma);
        }

    }
}

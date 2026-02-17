package Nivel_5;


/**
 * Exercício 18 - Nível 5
 * Objetivo: Somar os elementos de cada coluna e exibir a soma.
 */
public class Exercicio18 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {1, 1, 1},
                {1, 1, 2},
                {2, 1, 1}
        };

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[j][i];
            }
            System.out.println("Linha " + i + " = "+ soma);
        }

    }
}

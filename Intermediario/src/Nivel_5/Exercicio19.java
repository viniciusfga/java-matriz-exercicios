package Nivel_5;


/**
 * Exercício 19 - Nível 5
 * Objetivo: Transpor uma matriz (inverter linhas por colunas).
 */
public class Exercicio19 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {1, 1, 1},
                {1, 1, 2},
                {2, 1, 1}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[j][i]);
            }
            System.out.println();
        }

    }
}

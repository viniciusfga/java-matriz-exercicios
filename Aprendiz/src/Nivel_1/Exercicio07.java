package Nivel_1;


/**
 * Exercício 07 - Nível 1
 * Objetivo: Preencher uma matriz 3x1 com a tabuada do número 2.
 */
public class Exercicio07 {
    public static void main(String[] args) {

        

        int[][] matriz = new int[3][1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 2*(i + 1);
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

    }
}

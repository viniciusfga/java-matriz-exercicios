package Nivel_1;


/**
 * Exercício 08 - Nível 1
 * Objetivo: Criar uma matriz 4x1 com os primeiros quatro números pares.
 */
public class Exercicio08 {
    public static void main(String[] args) {

        

        int[][] matriz = new int[4][1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 2*(i + 1);
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

    }
}

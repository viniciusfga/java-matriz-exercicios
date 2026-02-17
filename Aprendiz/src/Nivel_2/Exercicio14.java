package Nivel_2;


/**
 * Exercício 14 - Nível 2
 * Objetivo: Criar uma matriz com valores decrescentes de 9 a 1 (3x3).
 */
public class Exercicio14 {
    public static void main(String[] args) {

        

        int[][] matriz = new int[3][3];

        int numero = 9;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero;
                System.out.print(matriz[i][j] + " ");
                numero--;
            }
            System.out.println();
        }

    }
}

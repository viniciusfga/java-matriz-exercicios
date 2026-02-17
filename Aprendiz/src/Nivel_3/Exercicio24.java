package Nivel_3;


/**
 * Exercício 24 - Nível 3
 * Objetivo: Criar uma matriz 5x1 com os primeiros 5 quadrados perfeitos.
 */
public class Exercicio24 {
    public static void main(String[] args) {

        

        int[][] matriz = new int[5][1];

        int numero = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero * numero;
                System.out.print(matriz[i][j] + " ");
                numero++;
            }
            System.out.println();
        }

    }
}

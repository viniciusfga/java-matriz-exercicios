package Nivel_2;


/**
 * Exercício 13 - Nível 2
 * Objetivo: Criar uma matriz 3x3 em que os valores são iguais à soma dos índices (i + j).
 */
public class Exercicio13 {
    public static void main(String[] args) {

        

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

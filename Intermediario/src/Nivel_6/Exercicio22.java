package Nivel_6;

public class Exercicio22 {
    public static void main(String[] args) {

        System.out.println("Multiplicar duas matrizes compatíveis.");

        int[][] matrizA = {
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        };
        int[][] matrizB = {
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        };

        int[][] matrizC = new int[3][3];

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                for (int k = 0; k < matrizC[i].length; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        for (int[] ints : matrizC) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
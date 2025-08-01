package Nivel_2;

public class Exercicio16 {
    public static void main(String[] args) {

        System.out.println("Imprimir somente a última coluna de uma matriz 3x3.");

        int[][] matriz = {
                {4, 3, 2},
                {2, 1, 0}
        };

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][matriz[i].length - 1]);
        }

    }
}

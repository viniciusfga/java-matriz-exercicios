package Nivel_4;

public class Exercicio05 {
    public static void main(String[] args) {

        System.out.println("Mostrar somente os elementos da diagonal principal.");

        int[][] matriz = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 1, 1}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.printf("%4d ", matriz[i][j]);
                } else {
                    System.out.printf("%4d ", 0);
                }
            }
            System.out.println();
        }

    }
}

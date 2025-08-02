package Nivel_3;

public class Exercicio21 {
    public static void main(String[] args) {

        System.out.println("Ler uma matriz 3x3 e imprimir a soma da diagonal principal.");

        int[][] matriz = {
                {4, 8, 2},
                {7, 1, 0},
                {6, 1, 0}
        };

        int somaDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    somaDiagonal+= matriz[i][j];
                }
            }
        }
        System.out.print(somaDiagonal);

    }
}

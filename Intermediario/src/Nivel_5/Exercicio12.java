package Nivel_5;

public class Exercicio12 {
    public static void main(String[] args) {

        System.out.println("Contar quantos elementos são pares em uma matriz.");

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int pares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares ++;
                }
            }
        }
        System.out.println(pares);

    }
}

package Nivel_2;

public class Exercicio17 {
    public static void main(String[] args) {

        System.out.println("Ler uma matriz 2x2 e imprimir seus elementos ao contrário (inverter a ordem).");

        int[][] matriz = {
                {4, 3},
                {2, 1}
        };

        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[0].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }
}

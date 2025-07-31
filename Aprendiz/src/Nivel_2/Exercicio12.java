package Nivel_2;

public class Exercicio12 {
    public static void main(String[] args) {

        System.out.println("Criar uma matriz 2x2 com os números 1 a 4 em ordem.");

        int[][] matriz = new int[2][2];

        int numero = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero;
                numero++;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

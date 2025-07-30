package Nivel_1;

public class Exercicio03 {
    public static void main(String[] args) {

        System.out.println("Imprimir uma matriz linha por linha usando dois for.");

        // Exemplo criando uma matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Imprimindo os valores usando dois for
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

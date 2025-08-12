package Nivel_4;

public class Exercicio01 {
    public static void main(String[] args) {

        System.out.println("Criar uma matriz 2x2 de inteiros e preencher manualmente.");

        int[][] matriz_A = {
                {3, 2},
                {1, 2}
        };
        System.out.println(matriz_A[0][0] + " " + matriz_A[0][1]);
        System.out.println(matriz_A[1][0] + " " + matriz_A[1][1]);

        System.out.println();

        // Exemplo 2 - Atribuindo valores manualmente

        int[][] matriz_B = new int[2][2];

        matriz_B[0][0] = 1;
        matriz_B[0][1] = 2;
        matriz_B[1][0] = 3;
        matriz_B[1][1] = 4;

        System.out.println(matriz_B[0][0] + " " + matriz_B[0][1]);
        System.out.println(matriz_B[1][0] + " " + matriz_B[1][1]);


    }
}

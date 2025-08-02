package Nivel_3;

public class Exercicio24 {
    public static void main(String[] args) {

        System.out.println("Criar uma matriz 5x1 com os primeiros 5 quadrados perfeitos.");

        int[][] matriz = new int[5][1];

        int numero = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero * numero;
                System.out.print(matriz[i][j] + " ");
                numero++;
            }
            System.out.println();
        }

    }
}

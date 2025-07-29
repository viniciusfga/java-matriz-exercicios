import java.util.Scanner;
import java.util.Random;
public class Exercise01 {
    public static void main(String[] args) {
        // Descrição do exercício
        System.out.println("Exercício 1: Declarar uma matriz 2x2 de inteiros.");

        // Declaração da matriz
        Random rand = new Random();
        int[][] matriz = new int[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }

        // Exemplo: imprimir a matriz vazia
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

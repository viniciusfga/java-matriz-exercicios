package Nivel_4;
import java.util.Scanner;


/**
 * Exercício 02 - Nível 4
 * Objetivo: Criar uma matriz 3x3 e preencher com valores digitados pelo usuário.
 */
public class Exercicio02 {
    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }

    }
}

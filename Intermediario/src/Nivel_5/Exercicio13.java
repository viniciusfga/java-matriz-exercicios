package Nivel_5;

import java.util.Scanner;


/**
 * Exercício 13 - Nível 5
 * Objetivo: Contar quantos elementos estão acima de um valor X fornecido pelo usuário.
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int numero = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numero < matriz[i][j]) {
                    contador++;
                }
            }
        }
        System.out.println(contador);

    }
}

package Nivel_1;


/**
 * Exercício 02 - Nível 1
 * Objetivo: Atribuir valores fixos à matriz e imprimir todos os elementos.
 */
public class Exercicio02 {
    public static void main(String[] args) {

        

        // Criando uma matriz 2x2 com valores fixos
        int[][] matriz = new int[2][2];

        // Atribuindo valores manualmente
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        // Imprimindo os valores manualmente (sem usar for)
        System.out.println(matriz[0][0] + " " + matriz[0][1]);
        System.out.println(matriz[1][0] + " " + matriz[1][1]);

    }
}
package Nivel_3;


/**
 * Exercício 23 - Nível 3
 * Objetivo: Criar uma matriz 3x3 com a letra 'X' em cada canto e espaços no centro.
 */
public class Exercicio23 {
    public static void main(String[] args) {

        

        String[][] matriz = new String[3][3];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ( ( i == 0 || i == 2) && ( ( j == 0 || j == 2) )  ) {
                    matriz[i][j] = "X";
                    System.out.print(matriz[i][j] + " ");
                } else {
                    matriz[i][j] = " ";
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}

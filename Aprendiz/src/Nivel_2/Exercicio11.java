package Nivel_2;

public class Exercicio11 {
    public static void main(String[] args) {

        System.out.println("Criar uma matriz 3x3 com todos os elementos iguais a 7.");

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 7;
            }
        }
        // Opcional: Imprimir a matriz para verificar o resultado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

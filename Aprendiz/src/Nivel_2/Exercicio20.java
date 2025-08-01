package Nivel_2;

public class Exercicio20 {
    public static void main(String[] args) {

        System.out.println("Criar uma matriz 3x3 com valores aleatórios entre 0 e 9 e contar quantos são maiores que 5.");

        int[][] matriz = {
                {4, 8, 2},
                {7, 1, 0},
                {6, 1, 0}
        };

        int qtd = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 5) {
                     qtd++;
                }
            }
        }
        System.out.print(qtd);

    }
}

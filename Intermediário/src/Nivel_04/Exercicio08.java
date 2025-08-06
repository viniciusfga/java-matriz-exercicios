package Nivel_04;

public class Exercicio08 {
    public static void main(String[] args) {

        System.out.println("Calcular a média dos elementos de uma matriz double[][].");

        double[][] matriz = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 1, 1}
        };

        double soma = 0;
        double media = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        media = soma / (matriz.length * matriz[0].length);
        System.out.print(media);

    }
}

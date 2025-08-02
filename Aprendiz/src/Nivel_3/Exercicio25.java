package Nivel_3;

public class Exercicio25 {
    public static void main(String[] args) {

        System.out.println("Ler uma matriz 3x3 e exibir o maior valor contido nela.");

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maior = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(maior < matriz[i][j]){
                    maior = matriz[i][j];
                }
            }
        }

        System.out.print(maior);

    }
}
